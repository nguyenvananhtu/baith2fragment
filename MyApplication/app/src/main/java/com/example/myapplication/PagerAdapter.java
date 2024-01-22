package com.example.myapplication;



import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.google.android.material.tabs.TabLayout;

public class PagerAdapter extends FragmentStatePagerAdapter {
    public PagerAdapter (FragmentManager fragmentManager){
        super(fragmentManager);

    }
    @Override
    public Fragment getItem(int position){
        Fragment frag  = null;
        switch (position){
            case 0:
                frag  = new FragmentOne();
                break;
            case 1:
                frag  = new FragmentTwo();
                break;
            case 2:
                frag  = new FragmentThree();
                break;
        }
        return frag ;
    }
    public int getCount(){
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position){
        String title = "";
        switch (position){
            case 0:
                title = "One";
                break;
            case 1:
                title = "Two";
                break;
            case 2:
                title = "Three";
                break;
        }
        return title;
    }


 }

