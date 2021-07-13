package com.example.android.quakereport;

public class Earthquake {
    private double mMagnitude;
    private String location, date;
    private long mTimeInMilliSeconds;
    private String mUrl;

    public Earthquake(double magnitude, String location, Long timeInMilliSeconds, String url) {
        this.mMagnitude = magnitude;
        this.location = location;
        this.mTimeInMilliSeconds = timeInMilliSeconds;
        this.mUrl = url;
    }


    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getTimeInMilliSeconds() {
        return mTimeInMilliSeconds;
    }

    public String getUrl() {
        return mUrl;
    }
}