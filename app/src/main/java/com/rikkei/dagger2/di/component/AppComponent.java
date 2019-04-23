package com.rikkei.dagger2.di.component;

import android.app.Application;

import com.rikkei.dagger2.DGApplication;
import com.rikkei.dagger2.di.module.ActivityBindingModule;
import com.rikkei.dagger2.di.module.ApiModule;
import com.rikkei.dagger2.di.module.ApplicationModule;
import com.rikkei.dagger2.di.module.DataSourceModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {ApplicationModule.class, DataSourceModule.class,
        ActivityBindingModule.class, ApiModule.class,
        AndroidSupportInjectionModule.class})
public interface AppComponent extends AndroidInjector<DGApplication> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        AppComponent.Builder application(Application application);

        AppComponent build();
    }
}
