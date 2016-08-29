package com.base.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by liu jun on 2016/8/29.
 */
public class MySurfaceView extends SurfaceView implements SurfaceHolder.Callback{

    private SurfaceHolder mHolder;

    public MySurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);

        mHolder = this.getHolder();
        mHolder.setFormat(PixelFormat.RGB_565);
        mHolder.addCallback(this);
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        Canvas canvas = mHolder.lockCanvas();
        if(canvas == null){
            return ;
        }
        drawSth(canvas);
        mHolder.unlockCanvasAndPost(canvas);
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }

    private void drawSth(Canvas canvas){

        Rect rect = new Rect(0, 0, canvas.getWidth(), canvas.getHeight());
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLUE);
        canvas.drawRect(rect, paint);

    }
}
