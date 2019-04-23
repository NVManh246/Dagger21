package com.rikkei.dagger2.ui.post;

import com.rikkei.dagger2.data.Post;

import java.util.List;

public interface MainContract {
    interface View {
        void showError();
        void showPosts(List<Post> posts);
    }

    interface Presenter {
        void getPost();
    }
}
