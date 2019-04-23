package com.rikkei.dagger2.data.api;

import com.rikkei.dagger2.Comment;
import com.rikkei.dagger2.data.Post;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.GET;

public interface APIService {
    @GET("posts")
    Flowable<List<Post>> getPosts();

    @GET("comments")
    Flowable<List<Comment>> getCommnents();
}
