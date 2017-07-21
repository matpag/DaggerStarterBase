package com.matpag.dagger.starter;

import android.app.Activity;

import com.matpag.dagger.starter.main.MainActivity;
import com.matpag.dagger.starter.main.MainActivityModule;
import com.matpag.dagger.starter.main.MainFragmentModule;

import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.multibindings.IntoMap;

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

}


//@Module(subcomponents = ActivityModule.MainActivitySubcomponent.class)
//abstract class ActivityModule {
//
//    @Binds
//    @IntoMap
//    @ActivityKey(MainActivity.class)
//    abstract AndroidInjector.Factory<? extends Activity>
//    bindMainActivityInjectorFactory(MainActivitySubcomponent.Builder builder);
//
//    @Subcomponent(modules = {
//            MainActivityModule.class,
//            MainFragmentModule.class
//    })
//    public interface MainActivitySubcomponent extends AndroidInjector<MainActivity>{
//        @Subcomponent.Builder
//        interface Builder {
//            @BindsInstance Builder baseActivity(BaseActivity baseActivity);
//            MainActivity build();
//        }
////        abstract class Builder extends AndroidInjector.Builder<MainActivity>{
////
////        }
//    }
//}