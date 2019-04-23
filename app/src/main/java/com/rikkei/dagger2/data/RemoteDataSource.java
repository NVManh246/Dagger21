package com.rikkei.dagger2.data;

import com.rikkei.dagger2.Comment;
import com.rikkei.dagger2.data.api.APIService;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Flowable;

public class RemoteDataSource implements DataSource {

    private APIService mAPIService;

    @Inject
    public RemoteDataSource(APIService APIService) {
        mAPIService = APIService;
    }

    @Override
    public Flowable<List<Post>> getPosts() {
        return mAPIService.getPosts();
    }

    @Override
    public Flowable<List<Comment>> getComments() {
        return mAPIService.getCommnents();
    }

    @Override
    public void hello() {

    }
}
