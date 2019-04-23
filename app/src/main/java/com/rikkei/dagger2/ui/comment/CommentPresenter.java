package com.rikkei.dagger2.ui.comment;

import com.rikkei.dagger2.data.repo.PostsRepository;
import com.rikkei.dagger2.ui.post.MainContract;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class CommentPresenter implements CommentContract.Presenter {

    private PostsRepository mPostsRepository;
    private MainContract.View mView;

    @Inject
    public CommentPresenter(PostsRepository postsRepository, MainContract.View view) {
        mPostsRepository = postsRepository;
        mView = view;
    }

    @Override
    public void getComments() {
        mPostsRepository.getComments().observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe();
    }
}
