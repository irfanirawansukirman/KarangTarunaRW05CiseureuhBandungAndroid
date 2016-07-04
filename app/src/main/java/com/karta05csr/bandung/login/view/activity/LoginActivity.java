package com.karta05csr.bandung.login.view.activity;

import android.content.Context;
import android.content.Intent;

import com.karta05csr.bandung.BaseActivity;
import com.karta05csr.bandung.R;
import com.karta05csr.bandung.login.viewmodel.controller.LoginController;

public class LoginActivity extends BaseActivity<LoginController> {

    @Override
    protected int getToolbarId() {
        return 0;
    }

    @Override
    protected int getResLayout() {
        return R.layout.login_activity;
    }

    @Override
    protected LoginController createController() {
        return new LoginController();
    }

    public static void startThisActivity(Context mContext){
        Intent intent = new Intent(mContext, LoginActivity.class);
        mContext.startActivity(intent);
    }
}
