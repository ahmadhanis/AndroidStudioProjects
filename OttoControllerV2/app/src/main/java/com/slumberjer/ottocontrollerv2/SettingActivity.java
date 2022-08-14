package com.slumberjer.ottocontrollerv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.provider.Settings;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Set;

public class SettingActivity extends AppCompatActivity {
    Button bSave,bLoad;
    EditText BL,BR,FL,FR, LA, RA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        BL = findViewById(R.id.editText);
        BR = findViewById(R.id.editText2);
        FL = findViewById(R.id.editText3);
        FR = findViewById(R.id.editText4);
        LA = findViewById(R.id.editText5);
        RA = findViewById(R.id.editText6);
        bSave = findViewById(R.id.btnSave);
        bLoad = findViewById(R.id.btnLoad);
        bSave.setEnabled(false);

        bSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String TBL, TBR, TFL, TFR, TLA, TRA;
                TBL = BL.getText().toString();
                TBR = BR.getText().toString();
                TFL = FL.getText().toString();
                TFR = FR.getText().toString();
                TLA = LA.getText().toString();
                TRA = RA.getText().toString();
                String urlset = "http://192.168.4.1/setting?a=" + TBL + "&b=" + TBR + "&c=" + TFL + "&d=" + TFR + "&e=" + TLA + "&f=" + TRA;
                commandOtto(urlset);
            }
        });

        bLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlset = "http://192.168.4.1/readsetting";
                getSettingOtto(urlset);

            }
        });
        //loadOttoSetting();
    }

    private void loadOttoSetting() {
        String urlset  = "http://192.168.4.1/readsetting";
        getSettingOtto(urlset);

    }

    private void getSettingOtto(final String url) {
        class GetSettingOtto extends AsyncTask<Void,Void,String> {
            private ProgressDialog progressDialog;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                progressDialog = new ProgressDialog(SettingActivity.this);
                progressDialog.setTitle("Loading Settings");
                progressDialog.setMessage("waiting...");
                progressDialog.setIndeterminate(false);
                progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progressDialog.setCancelable(false);
                progressDialog.show();
            }
            @Override
            protected String doInBackground(Void... voids) {
                HashMap<String, String> hashMap = new HashMap<>();
                RequestHandler rh = new RequestHandler();
                String s = rh.sendGetRequest(url);
                return s;
            }
            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                progressDialog.dismiss();
                Toast.makeText(SettingActivity.this, s, Toast.LENGTH_SHORT).show();
                String[] setting = s.split("\\s*,\\s*");
                BL.setText(setting[0]);
                BR.setText(setting[1]);
                FL.setText(setting[2]);
                FR.setText(setting[3]);
                LA.setText(setting[4]);
                RA.setText(setting[5]);
                if (BL.length()>0){
                    bSave.setEnabled(true);
                    //lsetting.setVisibility(View.VISIBLE);
                }else{
                    bSave.setEnabled(false);
                    //lsetting.setVisibility(View.GONE);
                }
            }
        }
        GetSettingOtto getSettingOtto = new GetSettingOtto();
        getSettingOtto.execute();
    }

    /*public String getIP(){
        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
        String ip = wifiInfo.getSSID();
        //String ipString = String.format("%d.%d.%d.%d", (ip & 0xff), (ip >> 8 & 0xff), (ip >> 16 & 0xff), (ip >> 24 & 0xff));
        Log.e("IP",ip);
        return ip;
    }*/

    private void commandOtto(final String url) {
        class CommandOtto extends AsyncTask<Void,Void,String> {
            private ProgressDialog progressDialog;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                progressDialog = new ProgressDialog(SettingActivity.this);
                progressDialog.setTitle("Loading Setting");
                progressDialog.setMessage("waiting...");
                progressDialog.setIndeterminate(false);
                progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progressDialog.setCancelable(false);
                progressDialog.show();
            }
            @Override
            protected String doInBackground(Void... voids) {
                HashMap<String, String> hashMap = new HashMap<>();
                RequestHandler rh = new RequestHandler();
                String s = rh.sendPostRequest(url, hashMap);
                Log.e("URL",url);
                return s;
            }
            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                progressDialog.dismiss();
                Toast.makeText(SettingActivity.this, s, Toast.LENGTH_SHORT).show();
            }
        }
        CommandOtto commandOtto = new CommandOtto();
        commandOtto.execute();
    }
}