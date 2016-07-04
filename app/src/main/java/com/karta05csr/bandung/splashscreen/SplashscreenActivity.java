package com.karta05csr.bandung.splashscreen;

import android.content.Context;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.karta05csr.bandung.R;
import com.karta05csr.bandung.home.view.activity.HomeActivity;
import com.karta05csr.bandung.login.view.activity.LoginActivity;

public class SplashscreenActivity extends AppCompatActivity {
    public Context mContext = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen_activity);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                LoginActivity.startThisActivity(mContext);
//                HomeActivity.startThisActivity(mContext);
            }
        }, 2500);
    }
}
