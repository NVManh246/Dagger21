package com.rikkei.dagger2.ui.comment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rikkei.dagger2.R;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;

public class CommentFragment extends DaggerFragment {

    @Inject
    public CommentFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_comment, container, false);
    }
}
