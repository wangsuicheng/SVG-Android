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
public class ic_exposure_neg_2 extends SVGRenderer {

    public ic_exposure_neg_2(Context context) {
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
        
        mPath.moveTo(15.05f, 16.29f);
        mPath.rLineTo(2.86f, -3.07f);
        mPath.rCubicTo(0.38f, -0.39f, 0.72f, -0.79f, 1.04f, -1.18f);
        mPath.rCubicTo(0.32f, -0.39f, 0.59f, -0.78f, 0.82f, -1.17f);
        mPath.rCubicTo(0.23f, -0.39f, 0.41f, -0.78f, 0.54f, -1.17f);
        mPath.rCubicTo(0.13000107f, -0.39000034f, 0.19f, -0.79f, 0.19f, -1.18f);
        mPath.rCubicTo(0.0f, -0.53f, -0.09f, -1.02f, -0.27f, -1.46f);
        mPath.rCubicTo(-0.18f, -0.44f, -0.44f, -0.81f, -0.78f, -1.11f);
        mPath.rCubicTo(-0.34f, -0.31f, -0.77f, -0.54f, -1.26f, -0.71f);
        mPath.rCubicTo(-0.51f, -0.16f, -1.08f, -0.24f, -1.72f, -0.24f);
        mPath.rCubicTo(-0.69f, 0.0f, -1.31f, 0.11f, -1.85f, 0.32f);
        mPath.rCubicTo(-0.54f, 0.21f, -1.0f, 0.51f, -1.36f, 0.88f);
        mPath.rCubicTo(-0.37f, 0.37f, -0.65f, 0.8f, -0.84f, 1.3f);
        mPath.rCubicTo(-0.18f, 0.47f, -0.27f, 0.97f, -0.28f, 1.5f);
        mPath.rLineTo(2.14f, 0f);
        mPath.rCubicTo(0.01f, -0.31f, 0.05f, -0.6f, 0.13f, -0.87f);
        mPath.rCubicTo(0.09f, -0.29f, 0.23f, -0.54f, 0.4f, -0.75f);
        mPath.rCubicTo(0.18f, -0.21f, 0.41f, -0.37f, 0.68f, -0.49f);
        mPath.rCubicTo(0.27f, -0.12f, 0.6f, -0.18f, 0.96f, -0.18f);
        mPath.rCubicTo(0.31f, 0.0f, 0.58f, 0.05f, 0.81f, 0.15f);
        mPath.rCubicTo(0.23f, 0.1f, 0.43f, 0.25f, 0.59f, 0.43f);
        mPath.rCubicTo(0.16f, 0.18f, 0.28f, 0.4f, 0.37f, 0.65f);
        mPath.rCubicTo(0.08f, 0.25f, 0.13f, 0.52f, 0.13f, 0.81f);
        mPath.rCubicTo(0.0f, 0.22f, -0.03f, 0.43f, -0.08f, 0.65f);
        mPath.rCubicTo(-0.06f, 0.22f, -0.15f, 0.45f, -0.29f, 0.7f);
        mPath.rCubicTo(-0.14f, 0.25f, -0.32f, 0.53f, -0.56f, 0.83f);
        mPath.rCubicTo(-0.23f, 0.3f, -0.52f, 0.65f, -0.88f, 1.03f);
        mPath.rLineTo(-4.17f, 4.55f);
        mPath.lineTo(12.370001f, 18.0f);
        mPath.lineTo(21.0f, 18.0f);
        mPath.rLineTo(0f, -1.71f);
        mPath.rLineTo(-5.95f, 0f);
        mPath.close();
        mPath.moveTo(15.05f, 16.29f);
        mPath.moveTo(2.0f, 11.0f);
        mPath.rLineTo(0f, 2.0f);
        mPath.rLineTo(8.0f, 0f);
        mPath.rLineTo(0f, -2.0f);
        mPath.lineTo(2.0f, 11.0f);
        mPath.close();
        mPath.moveTo(2.0f, 11.0f);
        
        mRenderPath.addPath(mPath, mFinalPathMatrix);
        if (mFillPaint == null) {
            mFillPaint = new Paint();
            mFillPaint.setStyle(Paint.Style.FILL);
            mFillPaint.setAntiAlias(true);
        }
        mFillPaint.setColor(applyAlpha(-16777216, 1.0f));
        mFillPaint.setColorFilter(filter);
        canvas.drawPath(mRenderPath, mFillPaint);

    }

}