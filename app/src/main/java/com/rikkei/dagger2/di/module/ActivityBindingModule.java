package com.rikkei.dagger2.di.module;

import com.rikkei.dagger2.di.ActivityScoped;
import com.rikkei.dagger2.ui.post.MainActivity;
import com.rikkei.dagger2.ui.post.MainModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity getMainActivity();
}
