package com.matpag.dagger.starter;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by Mattia Pagini on 11/06/2017.
 */

public class CustomApp extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerCustomAppComponent.create();
    }
}
