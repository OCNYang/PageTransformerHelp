package com.ocnyang.variationviewpager;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.ocnyang.pagetransformerhelp.BannerItemBean;
import com.ocnyang.pagetransformerhelp.BannerViewPager;
import com.ocnyang.pagetransformerhelp.ImageLoaderInterface;
import com.ocnyang.pagetransformerhelp.transformer.AccordionTransformer;
import com.ocnyang.pagetransformerhelp.transformer.BackgroundToForegroundTransformer;
import com.ocnyang.pagetransformerhelp.transformer.CubeInTransformer;
import com.ocnyang.pagetransformerhelp.transformer.CubeOutTransformer;
import com.ocnyang.pagetransformerhelp.transformer.DefaultTransformer;
import com.ocnyang.pagetransformerhelp.transformer.DepthPageTransformer;
import com.ocnyang.pagetransformerhelp.transformer.FlipHorizontalTransformer;
import com.ocnyang.pagetransformerhelp.transformer.FlipVerticalTransformer;
import com.ocnyang.pagetransformerhelp.transformer.ForegroundToBackgroundTransformer;
import com.ocnyang.pagetransformerhelp.transformer.ParallaxTransformer;
import com.ocnyang.pagetransformerhelp.transformer.RotateDownTransformer;
import com.ocnyang.pagetransformerhelp.transformer.RotateUpTransformer;
import com.ocnyang.pagetransformerhelp.transformer.ScaleInOutTransformer;
import com.ocnyang.pagetransformerhelp.transformer.StackTransformer;
import com.ocnyang.pagetransformerhelp.transformer.TabletTransformer;
import com.ocnyang.pagetransformerhelp.transformer.ZoomInTransformer;
import com.ocnyang.pagetransformerhelp.transformer.ZoomOutSlideTransformer;
import com.ocnyang.pagetransformerhelp.transformer.ZoomOutTranformer;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private final int[] mData = {R.drawable.img0, R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4};
    private final String[] mStrings = {"R.drawable.img0", "R.drawable.img1", "R.drawable.img2", "R.drawable.img3", "R.drawable.img4"};
    private BannerViewPager mBannerViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        /**
         * Pagetransformerhelp 库是一个封装的纯切换效果的库
         * 库中封装的 ViewPager 控件，只是为大家提供了一种自定义 ViewPager 的例子，不建议使用，建议大家还是根据想要的显示效果自己自定义。
         * 当然如果你比较懒，也可以直接使用。
         */

        mBannerViewPager = ((BannerViewPager) findViewById(R.id.viewPager2));

        mBannerViewPager.setData(getViewPagerDatas(),//设置数据
                new ImageLoaderInterface() {//设置图片加载器
                    @Override
                    public void displayImage(Context context, Object imgPath, ImageView imageView) {
                        Glide.with(context).load(imgPath).into(imageView);
                    }
                }).setPageTransformer(null)//设置切换效果
                .setAutoPlay(true)//设置是否自动播放
                .setOnBannerItemClickListener(new BannerViewPager.OnBannerItemClickListener() {//设置item的监听事件
                    @Override
                    public void OnClickLister(View view, int currentItem) {
                        Toast.makeText(ViewPagerActivity.this, "" + currentItem, Toast.LENGTH_SHORT).show();
                    }
                })
                .setHaveTitle(true);//设置是否显示标题
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.viewpagermenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
            case R.id.AccordionTransformer:
                getSupportActionBar().setTitle("AccordionTransformer");
                mBannerViewPager.setPageTransformer(new AccordionTransformer());
                break;
            case R.id.BackgroundToForegroundTransformer:
                getSupportActionBar().setTitle("BackgroundToForegroundTransformer");
                mBannerViewPager.setPageTransformer(new BackgroundToForegroundTransformer());
                break;
            case R.id.CubeInTransformer:
                getSupportActionBar().setTitle("CubeInTransformer");
                mBannerViewPager.setPageTransformer(new CubeInTransformer());
                break;
            case R.id.CubeOutTransformer:
                getSupportActionBar().setTitle("CubeOutTransformer");
                mBannerViewPager.setPageTransformer(new CubeOutTransformer());
                break;
            case R.id.DefaultTransformer:
                getSupportActionBar().setTitle("DefaultTransformer");
                mBannerViewPager.setPageTransformer(new DefaultTransformer());
                break;
            case R.id.DepthPageTransformer:
                getSupportActionBar().setTitle("DepthPageTransformer");
                mBannerViewPager.setPageTransformer(new DepthPageTransformer());
                break;
            case R.id.FlipVerticalTransformer:
                getSupportActionBar().setTitle("FlipVerticalTransformer");
                mBannerViewPager.setPageTransformer(new FlipVerticalTransformer());
                break;
            case R.id.FlipHorizontalTransformer:
                getSupportActionBar().setTitle("FlipHorizontalTransformer");
                mBannerViewPager.setPageTransformer(new FlipHorizontalTransformer());
                break;
            case R.id.ForegroundToBackgroundTransformer:
                getSupportActionBar().setTitle("ForegroundToBackgroundTransformer");
                mBannerViewPager.setPageTransformer(new ForegroundToBackgroundTransformer());
                break;
            case R.id.ParallaxTransformer:
                getSupportActionBar().setTitle("ParallaxTransformer");
                mBannerViewPager.setPageTransformer(new ParallaxTransformer());
                break;
            case R.id.RotateDownTransformer:
                getSupportActionBar().setTitle("RotateDownTransformer");
                mBannerViewPager.setPageTransformer(new RotateDownTransformer());
                break;
            case R.id.RotateUpTransformer:
                getSupportActionBar().setTitle("RotateUpTransformer");
                mBannerViewPager.setPageTransformer(new RotateUpTransformer());
                break;
            case R.id.ScaleInOutTransformer:
                getSupportActionBar().setTitle("ScaleInOutTransformer");
                mBannerViewPager.setPageTransformer(new ScaleInOutTransformer());
                break;
            case R.id.StackTransformer:
                getSupportActionBar().setTitle("StackTransformer");
                mBannerViewPager.setPageTransformer(new StackTransformer());
                break;
            case R.id.TabletTransformer:
                getSupportActionBar().setTitle("TabletTransformer");
                mBannerViewPager.setPageTransformer(new TabletTransformer());
                break;
            case R.id.ZoomInTransformer:
                getSupportActionBar().setTitle("ZoomInTransformer");
                mBannerViewPager.setPageTransformer(new ZoomInTransformer());
                break;
            case R.id.ZoomOutSlideTransformer:
                getSupportActionBar().setTitle("ZoomOutSlideTransformer");
                mBannerViewPager.setPageTransformer(new ZoomOutSlideTransformer());
                break;
            case R.id.ZoomOutTransformer:
                getSupportActionBar().setTitle("ZoomOutTranformer");
                mBannerViewPager.setPageTransformer(new ZoomOutTranformer());
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

    private List<BannerItemBean> getViewPagerDatas() {
        List<BannerItemBean> pagerItemBeanList = new ArrayList<>(mData.length);

        for (int i = 0; i < mData.length; i++) {
            pagerItemBeanList.add(new BannerItemBean(mData[i], mStrings[i]));
        }
        return pagerItemBeanList;
    }

}
