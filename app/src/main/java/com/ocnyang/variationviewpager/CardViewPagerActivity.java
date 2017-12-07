package com.ocnyang.variationviewpager;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.ocnyang.pagetransformerhelp.cardtransformer.CascadingPageTransformer;

import java.util.ArrayList;
import java.util.List;

public class CardViewPagerActivity extends AppCompatActivity {

    private final int[] mData = {R.drawable.img0, R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4};
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view_pager);
        mViewPager = ((ViewPager) findViewById(R.id.cardViewPager));
        mViewPager.setPageMargin(40);
        mViewPager.setOffscreenPageLimit(3);
        mViewPager.setPageTransformer(true,new CascadingPageTransformer()/*new RotateDownPageTransformer()*//*new AlphaPageTransformer()*/);
        mViewPager.setAdapter(new MyPagerAdapter(getViewPagerData(),this));
    }

    private List<ViewPagerItemBean> getViewPagerData() {
        List<ViewPagerItemBean> pagerItemBeanList = new ArrayList<>(mData.length);
        for (int i = 0; i < mData.length; i++) {
            pagerItemBeanList.add(new ViewPagerItemBean(mData[i], "OCN.Yang  "+i));
        }
        return pagerItemBeanList;
    }
}
