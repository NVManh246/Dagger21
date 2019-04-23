package com.rikkei.dagger2.ui.comment;

import com.rikkei.dagger2.Comment;

import java.util.List;

public interface CommentContract {
    interface View {
        void showComments(List<Comment> comments);
        void showError();
    }

    interface Presenter {
        void getComments();
    }
}
