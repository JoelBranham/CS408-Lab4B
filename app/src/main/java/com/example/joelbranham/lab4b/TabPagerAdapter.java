package com.example.joelbranham.lab4b;

import android.support.v4.app.*;
public class TabPagerAdapter extends FragmentPagerAdapter {

    private int tabCount;

    public TabPagerAdapter(FragmentManager fm, int numTabs) {
        super(fm);
        this.tabCount = numTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new TipCalculatorFragment();
            case 1: return new MilesConverterFragment();
            case 2: return new FahrenheitConverterFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
