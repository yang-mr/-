package com.example.drawdemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RegionIterator;
import android.support.annotation.Nullable;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Scroller;

import static android.graphics.Bitmap.createBitmap;

/**
 * Created on 2017/11/121:47.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class MyView extends View {

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }




    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvasByRotate(canvas);
    }

    /**
     * Canvas 画布的一些操作
        translate 移动
        canvas.rotate(30);//顺时针旋转画布
        canvas.scale(0.5f, 1);   //缩放  x 缩放到 原来到1／2  y 不变
        canvas.skew(1.732f,0);//X轴倾斜60度，Y轴不变
     */
    private void canvasByTranslate(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);

        canvas.translate(-20, -10);  //画布平移 dx dy
        Rect rect = new Rect(0, 0, 100, 100);
        canvas.drawRect(rect, paint);
    }

    private void canvasByRotate(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);

        canvas.rotate(40);
        Rect rect = new Rect(110, 110, 400, 400);
        canvas.drawRect(rect, paint);
    }

    float mLastX = 0;
    float mLastY = 0;

    @Override
    public boolean onTouchEvent(MotionEvent event) {
       /* float x = event.getRawX();
        float y = event.getRawY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:

                break;
            case MotionEvent.ACTION_MOVE:
                float diffX = x - mLastX;
                float diffY = y - mLastY;

                float translationX = this.getTranslationX() + diffX;
                float translationY = this.getTranslationY() + diffY;
                this.setTranslationX(translationX);
                this.setTranslationY(translationY);
                break;
            case MotionEvent.ACTION_UP:
                break;
        }
        mLastY = x;
        mLastY = y;*/
        return super.onTouchEvent(event);
    }

    @Override
    public void setOnTouchListener(OnTouchListener l) {
        super.setOnTouchListener(l);

    }

    /**
     * Created from 2017/11/3 23:09
     * Author jackyang
     * ------------------
     * @desc 测试弹性滑动
     * @param
     * @return
     */
   /* private void testScroller(){
        Scroller scroller = new Scroller(getContext());
        scroller.startScroll();
    }*/

    @Override
    public void computeScroll() {
        super.computeScroll();
    }

    /**
     * Created from 2017/11/1 21:49
     * Author jackyang
     * ------------------
     * @desc 绘制不规则的区域 region
     * @param
     * @return
     */
    private void drawOnAnomaly(Canvas canvas) {
        //初始化Paint
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);
        //构造一个椭圆路径
        Path ovalPath = new Path();
        RectF rect =  new RectF(50, 50, 200, 500);
        float x = rect.centerX();
        float y = rect.centerY();
        canvas.drawRect(rect, paint);
        ovalPath.addOval(rect, Path.Direction.CW);

        canvas.drawPath(ovalPath, paint);

        paint.setColor(Color.BLACK);
        //SetPath时,传入一个比椭圆区域小的矩形区域,让其取交集
        Region rgn = new Region();
        rgn.setPath(ovalPath, new  Region(50, 50, 200, 200));
        //画出路径
        //drawRegion(canvas, rgn, paint);


    }

    /**
     * Created from 2017/11/1 23:15
     * Author jackyang
     * ------------------
     * @desc
     * @param
     * @return
     */
    private void testCanvas(Canvas canvas) {
        Bitmap b = Bitmap.createBitmap(400, 400, Bitmap.Config.ARGB_8888);
        Canvas temp = new Canvas(b);
        Paint paint = new Paint();
        paint.setTextSize(50);
        paint.setColor(Color.RED);
        temp.drawText("kfjkdjfd", 0, 100, paint);

        canvas.drawBitmap(b, 0, 0, paint);
    }


    /**
     * Created from 2017/11/1 21:50
     * Author jackyang
     * ------------------
     * @desc  RegionIterator类，实现了获取组成区域的矩形集的功能
     * @param
     * @return
     */
    private void drawRegion(Canvas canvas, Region rgn, Paint paint) {
        RegionIterator regions = new RegionIterator(rgn);
        Rect rect = new Rect();
        while (regions.next(rect)) {
            canvas.drawRect(rect, paint);
        }
    }

}
