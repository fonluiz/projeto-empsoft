package com.example.melhoridade.melhoridade;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return FeedFragment.newInstance();
            default:
                return FeedFragment.newInstance();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
