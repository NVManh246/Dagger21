package com.rikkei.dagger2.data;

import com.rikkei.dagger2.Comment;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Flowable;

public class LocalDataSource implements DataSource {

    @Inject
    public LocalDataSource() {
    }

    @Override
    public Flowable<List<Post>> getPosts() {
        return null;
    }

    @Override
    public Flowable<List<Comment>> getComments() {
        return null;
    }

    @Override
    public void hello() {

    }
}
