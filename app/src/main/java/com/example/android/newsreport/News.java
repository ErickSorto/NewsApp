package com.example.android.newsreport;

public class News {
    private String imageURL;
    private String title, date;

    private String mUrl;

    public News(String imageURL, String title, String date, String url) {
        this.imageURL = imageURL;
        this.title = title;
        this.date = date;
        this.mUrl = url;
    }


    public String getImageURL() {
        return imageURL;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getUrl() {
        return mUrl;
    }
}