package com.jamesvuong.annarbortourguide;

/**
 * Created by jvuonger on 9/23/16.
 */

public class CityAttraction {
    private final String mCity = "Ann Arbor";
    private final String mState = "Michigan";
    private String mName;
    private String mAddress;
    private String mType;

    public CityAttraction(String name, String address) {
        mName = name;
        mAddress = address;
    }

    public void setName(String name) { mName = name; }
    public void setType(String type) { mType = type;}
    public void setAddress(String address) { mType = address;}

    public String getName() { return mName; }
    public String getType() { return mType; }
    public String getAddress() { return mAddress + ", " + mCity + ", " + mState ; }
}
