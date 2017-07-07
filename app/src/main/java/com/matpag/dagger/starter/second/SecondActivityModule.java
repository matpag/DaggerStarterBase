package com.matpag.dagger.starter.second;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Mattia Pagini on 07/07/2017.
 */

@Module
public class SecondActivityModule {

    @Provides
    Boolean getAnotherBoolean(){
        return true;
    }

}
