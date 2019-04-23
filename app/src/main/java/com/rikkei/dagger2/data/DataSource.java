package com.rikkei.dagger2.data;

import com.rikkei.dagger2.Comment;

import java.util.List;

import io.reactivex.Flowable;

public interface DataSource {
    Flowable<List<Post>> getPosts();
    Flowable<List<Comment>> getComments();

    void hello();
}
