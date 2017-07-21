package com.matpag.dagger.starter;

import com.matpag.dagger.starter.main.MainActivity;
import com.matpag.dagger.starter.main.MainActivityModule;
import com.matpag.dagger.starter.main.MainFragmentModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Mattia Pagini on 07/07/2017.
 */
@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = {
            MainActivityModule.class,
            MainFragmentModule.class
    })
    abstract MainActivity bindMainActivityInjector();

    @ContributesAndroidInjector()
    abstract BaseActivity bindBaseActivityInjector();

}