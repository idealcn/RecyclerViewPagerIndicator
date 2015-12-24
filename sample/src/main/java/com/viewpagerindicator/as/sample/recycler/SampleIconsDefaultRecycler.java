package com.viewpagerindicator.as.sample.recycler;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.viewpagerindicator.as.recycler.indicator.RecyclerIconPageIndicator;
import com.viewpagerindicator.as.recycler.pageview.RecyclerViewPager;
import com.viewpagerindicator.as.sample.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class SampleIconsDefaultRecycler extends BaseSampleActivity {

    @Bind(R.id.viewpager)
    RecyclerViewPager pager;
    @Bind(R.id.indicator)
    RecyclerIconPageIndicator indicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_icons_recycler);
        ButterKnife.bind(this);

        FragmentsAdapter adapter = new FragmentsAdapter(getSupportFragmentManager());
//        mAdapter = new com.viewpagerindicator.as.sample.TestFragmentAdapter(getSupportFragmentManager());

//        mPager = (ViewPager)findViewById(R.id.pager);
        pager.setAdapter(adapter);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation (LinearLayoutManager.HORIZONTAL);
        pager.setLayoutManager(manager);

//        mIndicator = (IconPageIndicator)findViewById(R.id.indicator);
        indicator.setViewPager(pager);
    }
}
