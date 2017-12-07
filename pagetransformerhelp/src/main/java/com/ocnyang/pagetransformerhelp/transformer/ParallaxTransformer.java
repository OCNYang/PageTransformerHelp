package com.ocnyang.pagetransformerhelp.transformer;

import android.support.v4.view.ViewPager;
import android.view.View;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by OCN.Yang
 *    *     *   *         * *   *       Time:2017/12/6 17:59.
 *    *     *   *         *   * *       Email address:ocnyang@gmail.com
 *    * * * *   * * * *   *     *.Yang  Web site:www.ocnyang.com
 *******************************************************************/


public class ParallaxTransformer implements ViewPager.PageTransformer {
    @Override
    public void transformPage(View page, float position) {
        int width = page.getWidth();
        if (position < -1) {
            page.setScrollX((int) (width * 0.75 * -1));
        } else if (position <= 1) {
            if (position < 0) {
                page.setScrollX((int) (width * 0.75 * position));
            } else {
                page.setScrollX((int) (width * 0.75 * position));
            }
        } else {
            page.setScrollX((int) (width * 0.75));
        }
    }
}
