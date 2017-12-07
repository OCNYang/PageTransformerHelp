package com.ocnyang.pagetransformerhelp;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by OCN.Yang
 *    *     *   *         * *   *       Time:2017/12/6 11:20.
 *    *     *   *         *   * *       Email address:ocnyang@gmail.com
 *    * * * *   * * * *   *     *.Yang  Web site:www.ocnyang.com
 *******************************************************************/


public class BannerAdapter extends PagerAdapter {
    private BannerViewPager bannerViewPager;
    private int mItemCount = 1;

    public List<BannerItemBean> getData() {
        return mData;
    }

    public void setData(List<BannerItemBean> data) {
        mData = data;
        if (mData != null && mData.size() != 0) {
            mItemCount = mData.size();
        }
    }

    private List<BannerItemBean> mData;
    private List<ImageView> mViews;
    private ImageView.ScaleType mScaleType;

    private ImageView.ScaleType getScaleType() {
        return mScaleType == null ? ImageView.ScaleType.CENTER_CROP : mScaleType;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        mScaleType = scaleType;
    }

    public BannerAdapter(BannerViewPager bannerViewPager) {
        mViews = new ArrayList<>();
        this.bannerViewPager = bannerViewPager;
    }

    @Override
    public int getCount() {
        return mData == null ? 0 : Integer.MAX_VALUE;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(mViews.get(position % mItemCount));
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        if (mViews.size() <= mItemCount) {
            for (int i = 0; i < mItemCount; i++) {
                ImageView imageView = new ImageView(container.getContext());
                imageView.setScaleType(getScaleType());
                bannerViewPager.displayImg(container.getContext(), imageView, mData.get(i).getImg_path());
                mViews.add(imageView);
            }
        }

        ImageView imageView = mViews.get(position % mItemCount);
        container.addView(imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bannerViewPager.OnBannerItemClick(view);
            }
        });

        return imageView;
    }

}
