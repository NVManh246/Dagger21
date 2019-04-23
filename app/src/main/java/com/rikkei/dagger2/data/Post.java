package com.rikkei.dagger2.data;

import com.google.gson.annotations.SerializedName;

public class Post {
    @SerializedName("id")
    private long mId;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("body")
    private String mBody;

    public Post() {
    }

    public long getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getBody() {
        return mBody;
    }
}
