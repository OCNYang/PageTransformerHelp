package com.ocnyang.pagetransformerhelp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by OCN.Yang
 *    *     *   *         * *   *       Time:2017/12/6 13:55.
 *    *     *   *         *   * *       Email address:ocnyang@gmail.com
 *    * * * *   * * * *   *     *.Yang  Web site:www.ocnyang.com
 *******************************************************************/


public class Indicator extends BaseIndicator {
    private Paint mPaint;

    public Indicator(Context context) {
        super(context);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        setState(false);
    }

    @Override
    public void setState(boolean b) {
        if (b){
            mPaint.setColor(0xffffffff);
        }else {
            mPaint.setColor(0x88ffffff);
        }
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();

        Log.e("heigth",""+measuredHeight);
        Log.e("width",""+measuredWidth);
        canvas.translate(measuredWidth * 0.5F, measuredHeight * 0.5F);
        canvas.drawCircle(0F, 0F, measuredWidth * 0.5F, mPaint);
    }

//    @Override
//    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//        setMeasuredDimension(20,20);
////        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
//    }
}
