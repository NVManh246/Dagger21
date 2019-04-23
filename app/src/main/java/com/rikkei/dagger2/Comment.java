package com.rikkei.dagger2;

import com.google.gson.annotations.SerializedName;

public class Comment {
    @SerializedName("postId")
    private long mPostId;
    @SerializedName("id")
    private long mId;
    @SerializedName("name")
    private String mName;
    @SerializedName("body")
    private String mBody;

    public Comment() {
    }

    public long getPostId() {
        return mPostId;
    }

    public long getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public String getBody() {
        return mBody;
    }
}
