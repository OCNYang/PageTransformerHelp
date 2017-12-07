package com.ocnyang.pagetransformerhelp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by OCN.Yang
 *    *     *   *         * *   *       Time:2017/12/6 14:20.
 *    *     *   *         *   * *       Email address:ocnyang@gmail.com
 *    * * * *   * * * *   *     *.Yang  Web site:www.ocnyang.com
 *******************************************************************/


public abstract class BaseIndicator extends View {

    public BaseIndicator(Context context) {
        super(context);
    }

    public BaseIndicator(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseIndicator(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public abstract void setState(boolean b);
}
