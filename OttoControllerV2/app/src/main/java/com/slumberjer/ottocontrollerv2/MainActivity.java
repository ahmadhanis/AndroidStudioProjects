package com.slumberjer.ottocontrollerv2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.Settings;
import androidx.appcompat.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import java.util.HashMap;


public class MainActivity extends AppCompatActivity {
    Button bForward,bLeft,bRight,bTipToe,bBack, bStop,bLoad,bhupdown,bBendLeft,bBendRight,bShakeLeft,bhup, bShakeRight,bUpDown,bMoonwalk,bJump,bSwing,bJitter,bAsc,bCrusaito,bFlap,bRun,bAuto,bSave,bWave;
    EditText YL,YR,RL,RR, LA, RA;
    TextView tvIP;
    Button btnSetting,btnWiFi;
    LinearLayout lsetting;
    Boolean isVisible = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvIP = findViewById(R.id.textViewIP);
        YL = findViewById(R.id.editText);
        YR = findViewById(R.id.editText2);
        RL = findViewById(R.id.editText3);
        RR = findViewById(R.id.editText4);
        LA = findViewById(R.id.editText5);
        RA = findViewById(R.id.editText6);
        btnSetting = findViewById(R.id.btnSetting);
        btnWiFi = findViewById(R.id.btnWifi);
        bSave = findViewById(R.id.btnSave);
        bForward = findViewById(R.id.btnForward);
        bLeft = findViewById(R.id.btnLeft);
        bRight = findViewById(R.id.btnRight);
        bBack = findViewById(R.id.btnBack);
        bBendLeft = findViewById(R.id.btnBendL);
        bBendRight = findViewById(R.id.btnBendR);
        bBendLeft = findViewById(R.id.btnBendL);
        bShakeLeft = findViewById(R.id.btnShakeL);
        bShakeRight= findViewById(R.id.btnShakeR);
        bUpDown= findViewById(R.id.btnUpDown);
        bMoonwalk = findViewById(R.id.btnMoonWalk);
        bJump = findViewById(R.id.btnJump);
        bSwing = findViewById(R.id.btnSwing);
        bJitter = findViewById(R.id.btnJitter);
        bAsc = findViewById(R.id.btnASC);
        bCrusaito = findViewById(R.id.btnCrusaito);
        bFlap = findViewById(R.id.btnFlap);
        bRun = findViewById(R.id.btnRun2);
        bAuto = findViewById(R.id.btnAuto);
        bStop = findViewById(R.id.btnStop);
        bLoad = findViewById(R.id.btnLoad);
//        lsetting = findViewById(R.id.layoutSetting);
//        lsetting.setVisibility(View.GONE);
        bWave = findViewById(R.id.btnWave);
        bhup = findViewById(R.id.btnHandsup);
        bhupdown = findViewById(R.id.btnHandsupdown);
        bTipToe = findViewById(R.id.btnTipToe);
        //String ottoip = getIP();
//        bSave.setEnabled(false);

        bForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commandKame("http://192.168.4.1/1");

            }
        });

        bLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commandKame("http://192.168.4.1/3");

            }
        });

        bRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commandKame("http://192.168.4.1/2");
            }
        });

        bBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commandKame("http://192.168.4.1/4");
            }
        });

        bBendLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commandKame("http://192.168.4.1/5");
            }
        });

        bBendRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commandKame("http://192.168.4.1/6");
            }
        });
        bShakeLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commandKame("http://192.168.4.1/8");
            }
        });

        bShakeRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commandKame("http://192.168.4.1/7");
            }
        });

        bUpDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commandKame("http://192.168.4.1/9");
            }
        });

        bMoonwalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commandKame("http://192.168.4.1/10");

            }
        });
        bJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commandKame("http://192.168.4.1/11");

            }
        });
        bSwing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commandKame("http://192.168.4.1/12");
            }
        });

        bJitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commandKame("http://192.168.4.1/14");

            }
        });
        bAsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commandKame("http://192.168.4.1/15");
            }
        });
        bCrusaito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commandKame("http://192.168.4.1/16");
            }
        });

        bFlap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commandKame("http://192.168.4.1/17");
            }
        });

        bRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commandKame("http://192.168.4.1/18");
            }
        });

        bAuto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commandKame("http://192.168.4.1/19");
            }
        });

        bStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commandKame("http://192.168.4.1/20");
            }
        });
        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SettingActivity.class);
                startActivity(intent);
            }
        });

        btnWiFi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvIP.setText(getIP());
            }
        });
//        bSave.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String TYL,TYR,TRL,TRR, TLA, TRA;
//                TYL = YL.getText().toString();TYR = YR.getText().toString();TRL = RL.getText().toString();
//                TRR = RR.getText().toString();TLA = LA.getText().toString();TRA = RA.getText().toString();
//                String urlset  = "http://192.168.4.1/setting?a="+TYL+"&b="+TYR+"&c="+TRL+"&d="+TRR+"&e="+TLA+"&f="+TRA;
//                Toast.makeText(MainActivity.this, urlset, Toast.LENGTH_SHORT).show();
//                commandKame(urlset);
//
//            }
//        });

//        bLoad.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, SettingActivity.class);
//                startActivity(intent);
//                /*String kameip = getIP();
//                if (kameip.contains("otto")){
//                    String urlset  = "http://192.168.4.1/readsetting";
//                    getSettingOtto(urlset);
//                }else{
//                    Toast.makeText(MainActivity.this, "Otto not connected", Toast.LENGTH_SHORT).show();
//                    startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS));
//                }*/
//            }
//        });

        bWave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commandKame("http://192.168.4.1/21");

            }
        });

        bhup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commandKame("http://192.168.4.1/22");
            }
        });

        bhupdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commandKame("http://192.168.4.1/23");
            }
        });

        bTipToe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                commandKame("http://192.168.4.1/13");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuitem, menu);
        return true;
    }

    private void commandKame(final String url) {
        class CommandKame extends AsyncTask<Void,Void,String> {
            private ProgressDialog progressDialog;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("Executing instruction");
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
                Log.e("URL",url);
                return s;
            }
            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                progressDialog.dismiss();
                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            }
        }
        CommandKame commandKame = new CommandKame();
        commandKame.execute();
    }

//    private void getSettingOtto(final String url) {
//        class GetSettingOtto extends AsyncTask<Void,Void,String> {
//
//            @Override
//            protected String doInBackground(Void... voids) {
//                HashMap<String, String> hashMap = new HashMap<>();
//                RequestHandler rh = new RequestHandler();
//                String s = rh.sendPostRequest(url,hashMap);
//                return s;
//            }
//            @Override
//            protected void onPostExecute(String s) {
//                super.onPostExecute(s);
//                //Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
//                String[] setting = s.split("\\s*,\\s*");
//                YL.setText(setting[0]);
//                YR.setText(setting[1]);
//                RL.setText(setting[2]);
//                RR.setText(setting[3]);
//                LA.setText(setting[4]);
//                RA.setText(setting[5]);
//                if (YL.length()>0){
//                    bSave.setEnabled(true);
//                    lsetting.setVisibility(View.VISIBLE);
//                }else{
//                    bSave.setEnabled(false);
//                    lsetting.setVisibility(View.GONE);
//                }
//            }
//        }
//        GetSettingOtto getSettingOtto = new GetSettingOtto();
//        getSettingOtto.execute();
//    }

    /*public boolean isInternetOn() {
        ConnectivityManager connec =
                (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.CONNECTED ||
                connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.CONNECTING ||
                connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.CONNECTING ||
                connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.CONNECTED) {
            return true;
        } else if (
                connec.getNetworkInfo(0).getState() == android.net.NetworkInfo.State.DISCONNECTED ||
                        connec.getNetworkInfo(1).getState() == android.net.NetworkInfo.State.DISCONNECTED) {
            return false;
        }
        return false;
    }
    public String getIP(){
        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
        String ip = wifiInfo.getSSID();
        //String ipString = String.format("%d.%d.%d.%d", (ip & 0xff), (ip >> 8 & 0xff), (ip >> 16 & 0xff), (ip >> 24 & 0xff));
        Log.e("IP",ip);
        return ip;
    }
*/
    public String getIP(){
        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        WifiInfo wifiInfo = wifiManager.getConnectionInfo();
        String ip = wifiInfo.getSSID();
        //String ipString = String.format("%d.%d.%d.%d", (ip & 0xff), (ip >> 8 & 0xff), (ip >> 16 & 0xff), (ip >> 24 & 0xff));
        Log.e("IP",ip);
        return ip;
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_setting:
                Intent intent = new Intent(MainActivity.this, SettingActivity.class);
                startActivity(intent);
                /*if (!isVisible){
                    isVisible = true;
                    String kameip = getIP();
                    if (kameip.contains("otto")){
                        String urlset  = "http://192.168.4.1/readsetting";
                        getSettingOtto(urlset);
                    }else{
                        Toast.makeText(MainActivity.this, "Otto not connected", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS));
                        lsetting.setVisibility(View.GONE);
                    }
                }else{
                    lsetting.setVisibility(View.GONE);
                    isVisible = false;
                }*/
                return true;
            case R.id.action_about:
                Toast.makeText(this, "This application developed by Ahmad Hanis. You can contact him at slumberjer@gmail.com for further info",Toast.LENGTH_LONG).show();
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
}