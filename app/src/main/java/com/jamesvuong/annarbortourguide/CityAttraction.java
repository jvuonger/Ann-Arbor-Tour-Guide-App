package com.jamesvuong.annarbortourguide;

/**
 * Created by jvuonger on 9/23/16.
 */

public class CityAttraction {
    private String mName;
    private String mType;

    public CityAttraction(String name, String type) {
        mName = name;
        mType = type;
    }

    public void setName(String name) { mName = name; }
    public void setType(String type) { mType = type;}

    public String getName() { return mName; }
    public String getType() { return mType; }
}
