package com.rikkei.dagger2.di.module;

import com.rikkei.dagger2.data.DataSource;
import com.rikkei.dagger2.data.Local;
import com.rikkei.dagger2.data.LocalDataSource;
import com.rikkei.dagger2.data.Remote;
import com.rikkei.dagger2.data.RemoteDataSource;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DataSourceModule {

    @Remote
    @Binds
    abstract DataSource getRemoteDataSource(RemoteDataSource remoteDataSource);

    @Local
    @Binds
    abstract DataSource getLocalDataSource(LocalDataSource localDataSource);
}
