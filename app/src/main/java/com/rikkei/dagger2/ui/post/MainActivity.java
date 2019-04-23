package com.rikkei.dagger2.ui.post;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rikkei.dagger2.R;
import com.rikkei.dagger2.adapter.OnItemClickListener;
import com.rikkei.dagger2.adapter.PostAdapter;
import com.rikkei.dagger2.data.Post;
import com.rikkei.dagger2.data.api.APIService;
import com.rikkei.dagger2.di.module.ApiModule;
import com.rikkei.dagger2.ui.comment.CommentFragment;

import org.reactivestreams.Publisher;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.Lazy;
import dagger.android.support.DaggerAppCompatActivity;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends DaggerAppCompatActivity implements MainContract.View,
        OnItemClickListener<Post> {

    @Inject
    MainPresenter mMainPresenter;

    @BindView(R.id.recycler_post)
    RecyclerView mRecyclerPost;

    private PostAdapter mPostAdapter;

    @Inject
    CommentFragment mCommentFragmentLazy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mPostAdapter = new PostAdapter(this);
        mRecyclerPost.setAdapter(mPostAdapter);
        mRecyclerPost.setLayoutManager(new LinearLayoutManager(this));

        mMainPresenter.getPost();

    }

    @Override
    public void showError() {

    }

    @Override
    public void showPosts(List<Post> posts) {
        mPostAdapter.setPosts(posts);
    }

    @Override
    public void onItemClick(Post post) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_comment, mCommentFragmentLazy)
                .commit();
    }
}
