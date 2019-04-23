package com.rikkei.dagger2.ui.post;

import com.rikkei.dagger2.data.Post;
import com.rikkei.dagger2.data.repo.PostsRepository;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class MainPresenter implements MainContract.Presenter {

    private PostsRepository mPostsRepository;
    private MainContract.View mView;
    private CompositeDisposable mCompositeDisposable;

    @Inject
    public MainPresenter(PostsRepository postsRepository, MainContract.View view) {
        mPostsRepository = postsRepository;
        mView = view;

        mCompositeDisposable = new CompositeDisposable();
    }

    @Override
    public void getPost() {
        Disposable disposable = mPostsRepository.getPosts()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Consumer<List<Post>>() {
                    @Override
                    public void accept(List<Post> posts) throws Exception {
                        mView.showPosts(posts);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        mView.showError();
                        System.out.println(throwable.toString());
                    }
                });
        mCompositeDisposable.add(disposable);
    }
}
