package com.example.android.newsreport;

public class News {
    private String imageURL;
    private String title, date, authorName, sectionName;

    private String mUrl;

    public News(String imageURL, String title, String date, String authorName, String sectionName, String url) {
        this.imageURL = imageURL;
        this.title = title;
        this.date = date;
        this.mUrl = url;
        this.authorName = authorName;
        this.sectionName = sectionName;
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

    public String getAuthorName() {
        return authorName;
    }

    public String getSectionName() {
        return sectionName;
    }
}