package com.example.android.quakereport;

public class Earthquake {
    private double mMag ;

    private String mLocation;

    private String mDate;

    public Earthquake(double mMag, String mLocation, String mDate) {
        this.mMag = mMag;
        this.mLocation = mLocation;
        this.mDate = mDate;
    }

    public double getmMag() {
        return mMag;
    }

    public void setmMag(double mMag) {
        this.mMag = mMag;
    }

    public String getmLocation() {
        return mLocation;
    }

    public void setmLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }
}
