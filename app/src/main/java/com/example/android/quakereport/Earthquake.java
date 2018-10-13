package com.example.android.quakereport;

public class Earthquake {
    private double mMag;
    private String mLocation;


    /**
     * Time of the earthquake
     */
    private long mTimeInMilliseconds;
    private String mUrl;



    public Earthquake(double mMag, String mLocation, String mUrl, long mTimeInMilliseconds) {
        this.mMag = mMag;
        this.mLocation = mLocation;
        this.mUrl = mUrl;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getmUrl() {
        return mUrl;
    }

    public double getMagnitude() {
        return mMag;
    }
}
