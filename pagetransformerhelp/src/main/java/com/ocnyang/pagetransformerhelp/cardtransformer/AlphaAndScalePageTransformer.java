package com.ocnyang.pagetransformerhelp.cardtransformer;

import android.support.v4.view.ViewPager;
import android.view.View;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by OCN.Yang
 *    *     *   *         * *   *       Time:2017/12/8 11:28.
 *    *     *   *         *   * *       Email address:ocnyang@gmail.com
 *    * * * *   * * * *   *     *.Yang  Web site:www.ocnyang.com
 *******************************************************************/


public class AlphaAndScalePageTransformer implements ViewPager.PageTransformer {

    final float SCALE_MAX = 0.8f;
    final float ALPHA_MAX = 0.5f;

    @Override
    public void transformPage(View page, float position) {
        float scale = (position < 0)
                ? ((1 - SCALE_MAX) * position + 1)
                : ((SCALE_MAX - 1) * position + 1);
        float alpha = (position < 0)
                ? ((1 - ALPHA_MAX) * position + 1)
                : ((ALPHA_MAX - 1) * position + 1);
        if (position < 0) {
            page.setPivotX(page.getWidth());
            page.setPivotY(page.getHeight()/2);
        } else {
            page.setPivotX(0);
            page.setPivotY(page.getHeight()/2);
        }
        page.setScaleX(scale);
        page.setScaleY(scale);
        page.setAlpha(Math.abs(alpha));
    }
}
