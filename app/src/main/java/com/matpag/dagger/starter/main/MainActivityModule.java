package com.matpag.dagger.starter.main;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mattia Pagini on 07/07/2017.
 */
@Module
public class MainActivityModule {

    @Provides
    Boolean getBoolean(){
        return false;
    }

}
