package com.karta05csr.bandung.home.viewmodel.controller;

import com.karta05csr.bandung.databinding.HomeActivityBinding;
import com.karta05csr.bandung.home.viewmodel.HomeVM;

import id.gits.mvvmcore.controller.GitsController;

/**
 * Created by irfan on 17/06/16.
 */
public class HomeController extends GitsController<HomeVM, HomeActivityBinding> {
    @Override
    public HomeVM createViewModel(HomeActivityBinding binding) {
        return new HomeVM(mActivity, this, binding);
    }

    @Override
    public void bindViewModel(HomeActivityBinding binding, HomeVM viewModel) {
        binding.setVm(viewModel);
    }
}
