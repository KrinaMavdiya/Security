package com.example.security;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;


import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;


public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        TabLayout tabLayout = findViewById(R.id.tabBar);
        TabItem home = findViewById(R.id.home);
        TabItem scan = findViewById(R.id.scan);
        TabItem information = findViewById(R.id.information);
        final ViewPager viewPager = findViewById(R.id.viewpager);

        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());

        viewPager.setAdapter(pagerAdapter);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


}