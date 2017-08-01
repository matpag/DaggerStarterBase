package com.matpag.dagger.starter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
class AppModule {

    @Singleton
    @Provides
    String provideString(){
        return "ciao";
    }
}
