package com.rikkei.dagger2.di.module;

import com.rikkei.dagger2.data.api.APIService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class ApiModule {

    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/";

    @Singleton
    @Provides
    static APIService getUsersService(Retrofit retrofit) {
        return retrofit.create(APIService.class);
    }

    @Singleton
    @Provides
    public static Retrofit getRetrofit() {
        return new Retrofit.Builder().baseUrl(BASE_URL)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
