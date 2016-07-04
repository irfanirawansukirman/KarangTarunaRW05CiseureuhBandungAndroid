package com.karta05csr.bandung.login.viewmodel;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.karta05csr.bandung.databinding.LoginActivityBinding;
import com.karta05csr.bandung.home.view.activity.HomeActivity;
import com.karta05csr.bandung.login.viewmodel.controller.LoginController;

import id.gits.mvvmcore.viewmodel.GitsVM;

/**
 * Created by irfan on 04/07/16.
 */
public class LoginVM extends GitsVM<LoginController, LoginActivityBinding> {

    public LoginVM(AppCompatActivity activity, LoginController controller, LoginActivityBinding binding) {
        super(activity, controller, binding);
    }

    public void onLogin(View view){
        HomeActivity.startThisActivity(mActivity);
    }
}
