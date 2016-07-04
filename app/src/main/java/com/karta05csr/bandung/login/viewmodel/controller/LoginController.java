package com.karta05csr.bandung.login.viewmodel.controller;

import com.karta05csr.bandung.databinding.LoginActivityBinding;
import com.karta05csr.bandung.login.viewmodel.LoginVM;

import id.gits.mvvmcore.controller.GitsController;

/**
 * Created by irfan on 04/07/16.
 */
public class LoginController extends GitsController<LoginVM, LoginActivityBinding> {

    @Override
    public LoginVM createViewModel(LoginActivityBinding binding) {
        return new LoginVM(mActivity, this, binding);
    }

    @Override
    public void bindViewModel(LoginActivityBinding binding, LoginVM viewModel) {
        binding.setVm(viewModel);
    }
}
