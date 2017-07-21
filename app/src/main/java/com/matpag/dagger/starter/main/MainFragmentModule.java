package com.matpag.dagger.starter.main;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Mattia Pagini on 10/07/2017.
 */

@Module
public abstract class MainFragmentModule {

    @ContributesAndroidInjector()
    abstract FirstFragment bindFirstFragmentInjector();

}