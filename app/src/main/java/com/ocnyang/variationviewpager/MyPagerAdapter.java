package com.ocnyang.variationviewpager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by OCN.Yang
 *    *     *   *         * *   *       Time:2017/12/6 10:47.
 *    *     *   *         *   * *       Email address:ocnyang@gmail.com
 *    * * * *   * * * *   *     *.Yang  Web site:www.ocnyang.com
 *******************************************************************/


public class MyPagerAdapter extends PagerAdapter {

    private List<ViewPagerItemBean> mData;
    private Context mContext;

    public MyPagerAdapter(List<ViewPagerItemBean> data, Context context) {
        mData = data;
        mContext = context;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View inflate = LayoutInflater.from(container.getContext()).inflate(R.layout.cardviewpager_item, container, false);
        ImageView imageView1 = (ImageView) inflate.findViewById(R.id.img_card_item);
        TextView textView = (TextView) inflate.findViewById(R.id.title_card_item);

        Glide.with(mContext).load(mData.get(position).getImg_url()).into(imageView1);
        textView.setText(mData.get(position).getTilte_text()+"");
        container.addView(inflate);
        return inflate;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(((View) object));
    }
}
