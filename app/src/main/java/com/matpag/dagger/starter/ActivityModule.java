package com.matpag.dagger.starter;

import com.matpag.dagger.starter.main.MainActivity;
import com.matpag.dagger.starter.main.MainActivityModule;
import com.matpag.dagger.starter.second.SecondActivity;
import com.matpag.dagger.starter.second.SecondActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Mattia Pagini on 07/07/2017.
 */
@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity bindMainActivityInjector();

    @ContributesAndroidInjector(modules = SecondActivityModule.class)
    abstract SecondActivity bindSecondActivityInjector();

}
