package com.jamesvuong.annarbortourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by jvuonger on 9/23/16.
 */

public class CityAttractionTypeAdapter extends FragmentPagerAdapter {
    private String[] mTabTitles = new String[] {"Parks"};

    public CityAttractionTypeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public Fragment getItem(int position) {

        if(position == 0) {
            return new ParksFragment();
        } else {
            return new ParksFragment();
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabTitles[position];
    }
}
