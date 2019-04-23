package com.rikkei.dagger2.ui.post;

import com.rikkei.dagger2.di.ActivityScoped;
import com.rikkei.dagger2.di.FragmentScoped;
import com.rikkei.dagger2.ui.comment.CommentFragment;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainModule {

    @FragmentScoped
    @ContributesAndroidInjector
    abstract CommentFragment getCommentFragment();

    @ActivityScoped
    @Binds
    abstract MainContract.View getView(MainActivity mainActivity);
}
