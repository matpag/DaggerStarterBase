package com.matpag.dagger.starter;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * Created by Mattia Pagini on 11/06/2017.
 */

@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        ActivityModule.class,
        CustomAppModule.class
})
interface CustomAppComponent extends AndroidInjector<CustomApp> {}
