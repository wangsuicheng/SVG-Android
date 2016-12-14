package com.github.megatronking.svg.iconlibs;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

import com.github.megatronking.svg.support.SVGRenderer;

/**
 * AUTO-GENERATED FILE.  DO NOT MODIFY.
 * 
 * This class was automatically generated by the
 * SVG-Generator. It should not be modified by hand.
 */
public class ic_battery_90 extends SVGRenderer {

    public ic_battery_90(Context context) {
        super(context);
        mAlpha = 1.0f;
        mWidth = dip2px(24.0f);
        mHeight = dip2px(24.0f);
    }

    @Override
    public void render(Canvas canvas, int w, int h, ColorFilter filter) {
        
        final float scaleX = w / 24.0f;
        final float scaleY = h / 24.0f;
        
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(17.0f, 5.33f);
        mPath.cubicTo(17.0f, 4.6f, 16.4f, 4.0f, 15.67f, 4.0f);
        mPath.lineTo(14.0f, 4.0f);
        mPath.lineTo(14.0f, 2.0f);
        mPath.rLineTo(-4.0f, 0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.lineTo(8.33f, 4.0f);
        mPath.cubicTo(7.6f, 4.0f, 7.0f, 4.6f, 7.0f, 5.33f);
        mPath.lineTo(7.0f, 8.0f);
        mPath.rLineTo(10.0f, 0f);
        mPath.lineTo(17.0f, 5.33f);
        mPath.close();
        mPath.moveTo(17.0f, 5.33f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 0.3f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);
        mPath.reset();
        mRenderPath.reset();
        
        mFinalPathMatrix.setValues(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f});
        mFinalPathMatrix.postScale(scaleX, scaleY);
        
        mPath.moveTo(7.0f, 8.0f);
        mPath.rLineTo(0f, 12.67f);
        mPath.cubicTo(7.0f, 21.4f, 7.6f, 22.0f, 8.33f, 22.0f);
        mPath.rLineTo(7.33f, 0f);
        mPath.rCubicTo(0.74f, 0.0f, 1.34f, -0.6f, 1.34f, -1.33f);
        mPath.lineTo(17.0f, 8.0f);
        mPath.lineTo(7.0f, 8.0f);
        mPath.close();
        mPath.moveTo(7.0f, 8.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}