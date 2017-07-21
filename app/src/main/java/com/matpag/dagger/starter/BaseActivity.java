package com.matpag.dagger.starter;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;


import javax.inject.Inject;

import dagger.android.AndroidInjection;

/**
 * Created by Mattia Pagini on 11/06/2017.
 */

@SuppressLint("Registered")
public class BaseActivity extends AppCompatActivity {

    private Toolbar mToolbar;

//    @Inject
//    NavigationController navigationController;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        setupToolbar();
    }

    public void setupToolbar() {
        if (mToolbar == null) {
            mToolbar = (Toolbar) findViewById(R.id.toolbar);
            if (mToolbar != null) {
                setSupportActionBar(mToolbar);
            }
        }
    }
//
//    public NavigationController getNavController(){
//        return navigationController;
//    }
}
