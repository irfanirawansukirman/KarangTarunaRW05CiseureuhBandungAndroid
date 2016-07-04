package com.karta05csr.bandung.home.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.karta05csr.bandung.BaseActivity;
import com.karta05csr.bandung.R;
import com.karta05csr.bandung.home.viewmodel.controller.HomeController;

public class HomeActivity extends BaseActivity<HomeController>{
    @Override
    protected int getToolbarId() {
        return R.id.toolbar;
    }

    @Override
    protected int getResLayout() {
        return R.layout.home_activity;
    }

    @Override
    protected HomeController createController() {
        return new HomeController();
    }

    public static void startThisActivity(Context mContext){
        Intent intent = new Intent(mContext, HomeActivity.class);
        mContext.startActivity(intent);
    }
}
