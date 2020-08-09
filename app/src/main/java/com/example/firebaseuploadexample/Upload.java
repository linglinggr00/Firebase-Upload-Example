package com.example.firebaseuploadexample;

public class Upload {
    private String mName;
    private String mImageUrl;

    public Upload() {
        //empty constructor needed 需要空的建構子
    }

    public Upload(String name, String imageUrl) {
        mName = name;
        mImageUrl = imageUrl;

        if (name.trim().equals("")) {
            name = "No Name";
        }
    }

    public String getName() {
        return mName;
    }

    public void setmName(String name) {
        mName = name;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setmImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }
}
