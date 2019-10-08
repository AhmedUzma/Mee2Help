package com.user.mee2help.Activity;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

import com.user.mee2help.Constant.RuntimePermissionActivity;
import com.user.mee2help.Constant.SharedPref;
import com.user.mee2help.R;

public class SplashActivity extends RuntimePermissionActivity {

    private static final int REQUEST_PERMISSION = 20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        SplashActivity.super.requestAppPermissions(new String[]{
                        Manifest.permission.INTERNET,
                        Manifest.permission.ACCESS_NETWORK_STATE,
//                        Manifest.permission.READ_PHONE_STATE,
                },R.string.runtime_permissions_txt,
                REQUEST_PERMISSION);
    }
    private void startSplash(){
        new Handler().postDelayed(new Runnable() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void run() {
//                if(SharedPref.getBol(SplashActivity.this , SharedPref.isLogin)){
//                    startActivity(new Intent(SplashActivity.this, HomeActivity.class));
//                    finishAffinity();
//                }else{
                    startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                    finishAffinity();
//                }

            }
        },5000);
    }

    @Override
    public void onPermissionsGranted(int requestCode) {
//        if (id1.equals("1")) {
        startSplash();
//        }
    }
}
