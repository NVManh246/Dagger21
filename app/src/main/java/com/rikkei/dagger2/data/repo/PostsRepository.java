package com.rikkei.dagger2.data.repo;

import com.rikkei.dagger2.Comment;
import com.rikkei.dagger2.data.DataSource;
import com.rikkei.dagger2.data.Local;
import com.rikkei.dagger2.data.LocalDataSource;
import com.rikkei.dagger2.data.Post;
import com.rikkei.dagger2.data.Remote;
import com.rikkei.dagger2.data.RemoteDataSource;
import com.rikkei.dagger2.data.api.APIService;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Flowable;

public class PostsRepository implements DataSource {
//
//    private APIService mAPIService;
//
//    @Inject
//    public PostsRepository(APIService APIService) {
//        mAPIService = APIService;
//    }
//
//    public Flowable<List<Post>> getPosts() {
//        return mAPIService.getPosts();
//    }
//
//    public Flowable<List<Comment>> getCommnents() {
//        return mAPIService.getCommnents();
//    }

    private DataSource mRemoteDataSource;
    private DataSource mLocalDataSource;

    @Inject
    public PostsRepository(@Remote DataSource remoteDataSource, @Local DataSource localDataSource) {
        mRemoteDataSource = remoteDataSource;
        mLocalDataSource = localDataSource;
    }

    @Override
    public Flowable<List<Post>> getPosts() {
        return mRemoteDataSource.getPosts();
    }

    @Override
    public Flowable<List<Comment>> getComments() {
        return mRemoteDataSource.getComments();
    }

    @Override
    public void hello() {
        mLocalDataSource.hello();
    }
}
