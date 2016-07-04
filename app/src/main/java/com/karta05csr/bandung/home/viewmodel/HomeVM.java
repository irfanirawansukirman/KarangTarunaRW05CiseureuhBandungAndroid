package com.karta05csr.bandung.home.viewmodel;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;

import com.karta05csr.bandung.R;
import com.karta05csr.bandung.databinding.HomeActivityBinding;
import com.karta05csr.bandung.home.viewmodel.controller.HomeController;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

import id.gits.mvvmcore.viewmodel.GitsVM;

/**
 * Created by irfan on 17/06/16.
 */
public class HomeVM extends GitsVM<HomeController, HomeActivityBinding> {
    public BottomBar nBottomBar;

    public HomeVM(AppCompatActivity activity, HomeController controller, HomeActivityBinding binding) {
        super(activity, controller, binding);

        initBotNavigation();
    }

    public void initBotNavigation() {
        nBottomBar = BottomBar.attach(mActivity, null);
        nBottomBar.setItems(R.menu.menu_home);
        nBottomBar.setOnMenuTabClickListener(new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int menuItemId) {
                switch (menuItemId) {
                    case R.id.actiion_karta_05:
//                        FragmentManager nManager = mActivity.getSupportFragmentManager();
//                        nManager.beginTransaction().replace(R.id.fragment_container, HomeKarta05Fragment.newInstance()).commit();
                        break;
                    case R.id.action_panhut_05:
//                        FragmentManager nManagerr = mActivity.getSupportFragmentManager();
//                        nManagerr.beginTransaction().replace(R.id.fragment_container, HomePanhut05Fragment.newInstance()).commit();
                        break;
                    case R.id.action_rw_05:
                        break;
                }
            }

            @Override
            public void onMenuTabReSelected(@IdRes int menuItemId) {

            }
        });
    }
}
