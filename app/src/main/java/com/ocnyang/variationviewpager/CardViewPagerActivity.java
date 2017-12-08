package com.ocnyang.variationviewpager;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.ocnyang.pagetransformerhelp.cardtransformer.AlphaPageTransformer;
import com.ocnyang.pagetransformerhelp.cardtransformer.CascadingPageTransformer;
import com.ocnyang.pagetransformerhelp.cardtransformer.RotateDownPageTransformer;

import java.util.ArrayList;
import java.util.List;

public class CardViewPagerActivity extends AppCompatActivity {

    private final int[] mData = {R.drawable.img0, R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4};
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view_pager);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mViewPager = ((ViewPager) findViewById(R.id.cardViewPager));
        mViewPager.setOffscreenPageLimit(3);
        mViewPager.setAdapter(new MyPagerAdapter(getViewPagerData(),this));
    }

    private List<ViewPagerItemBean> getViewPagerData() {
        List<ViewPagerItemBean> pagerItemBeanList = new ArrayList<>(mData.length);
        for (int i = 0; i < mData.length; i++) {
            pagerItemBeanList.add(new ViewPagerItemBean(mData[i], "OCN.Yang - "+i));
        }
        return pagerItemBeanList;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.cardviewpagermenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case android.R.id.home:
                finish();
                break;
            case R.id.AlphaPageTransformer:
                getSupportActionBar().setTitle("AlphaPageTransformer");
                mViewPager.setPageMargin(40);
                mViewPager.setPageTransformer(true,new AlphaPageTransformer());
                break;
            case R.id.CascadingPageTransformer:
                getSupportActionBar().setTitle("CascadingPageTransformer");
                mViewPager.setPageTransformer(true,new CascadingPageTransformer());
                break;
            case R.id.RotateDownPageTransformer:
                getSupportActionBar().setTitle("RotateDownPageTransformer");
                mViewPager.setPageMargin(40);
                mViewPager.setPageTransformer(true,new RotateDownPageTransformer());
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
