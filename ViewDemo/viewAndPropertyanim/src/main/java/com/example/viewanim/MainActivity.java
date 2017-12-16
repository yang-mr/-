package com.example.viewanim;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.IntEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;
import android.widget.Toast;

import com.example.propertyAnim.CharEvaluator;
import com.example.propertyAnim.MyEvaluator;
import com.example.propertyAnim.MyInterploator;

public class MainActivity extends Activity implements View.OnClickListener {
    private TextView mTvTest;

    private MyView mMyView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvTest = findViewById(R.id.tv_test);
        mMyView = findViewById(R.id.myview);

        mTvTest.setOnClickListener(this);
        findViewById(R.id.bt).setOnClickListener(this);

        Toast.makeText(this, "原来的位置" + " left:" + mTvTest.getLeft(), 1).show();

        //测试 ValueAnimater
        //testValueAnimator();
        //testValueAnimatorByInterpolator();
        //testValueAnimatorByArgbEvaluator();
    }

    private void testCustomObjectAnimator() {
        ValueAnimator animator = ObjectAnimator.ofInt(mMyView, "pointRadio", 200);
        animator.setDuration(1000);
        animator.start();
    }

    @Override
    public void onClick(View v) {
        testCustomObjectAnimator();
        //if (v == mTvTest) {
//            Toast.makeText(this, "我被点击啦" + " left:" + mTvTest.getLeft(), 1).show();
//            return;
//        }
////        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alphaanim);
////        findViewById(R.id.tv_test).startAnimation(animation);    //使用xml 生成动画
//
//        //代码 使用动画
//        ScaleAnimation scaleAnimation = new ScaleAnimation(1, 1, 2, 2);
//        scaleAnimation.setDuration(1000);
//        scaleAnimation.setFillEnabled(true);
//        scaleAnimation.setInterpolator(new BounceInterpolator());   //设置插值器  比如先加速 后减速等
//
//
//        RotateAnimation rotateAnim = new RotateAnimation(0, 720,
//                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
//
//        TranslateAnimation translateAnimation = new TranslateAnimation(10, 300, 10, 400);
//        //使用动画集合
//        AnimationSet setAnim = new AnimationSet(true);
//        setAnim.addAnimation(rotateAnim);
//        setAnim.addAnimation(scaleAnimation);
//        setAnim.addAnimation(translateAnimation);
//
//        setAnim.setDuration(3000);
//        setAnim.setFillAfter(true);
//
//        mTvTest.startAnimation(setAnim);
    }

    public void testValueAnimator() {
        ValueAnimator animator = ValueAnimator.ofInt(0, 400);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
        animator.addUpdateListener(animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int value = (int) animation.getAnimatedValue();
            }
        });

        //监听动画的 各个动作
        Animator.AnimatorListener listener;
        animator.addListener(listener = new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });

        //取消监听
        animator.removeListener(listener);
        animator.removeUpdateListener(animatorUpdateListener);

        //取消所有 update监听
        animator.removeAllUpdateListeners();

        animator.setDuration(2000);
        animator.start();
    }

    public void testValueAnimatorByInterpolator() {
        ValueAnimator animator = ValueAnimator.ofInt(0, 400);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
        animator.addUpdateListener(animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int value = (int) animation.getAnimatedValue();
                mTvTest.layout(mTvTest.getLeft(), value, mTvTest.getRight(),mTvTest.getHeight() + value);
            }
        });

        animator.setInterpolator(new MyInterploator());
        animator.setEvaluator(new MyEvaluator());
        animator.setDuration(2000);
        animator.start();
    }

    public void testValueAnimatorByArgbEvaluator() {
        ValueAnimator animator = ValueAnimator.ofInt(0xffffffff, 0x22222222);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
        animator.addUpdateListener(animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int value = (int) animation.getAnimatedValue();
                mTvTest.setBackgroundColor(value);
            }
        });

        animator.setInterpolator(new MyInterploator());
        animator.setEvaluator(new ArgbEvaluator());
        animator.setDuration(2000);
        animator.start();
    }

    public void testValueAnimatorByOfObject() {
        ValueAnimator animator = ValueAnimator.ofObject(new CharEvaluator(), new Character('A'), new Character('Z'));
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
        animator.addUpdateListener(animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                char value = (char) animation.getAnimatedValue();
                mTvTest.setText(value + "");
            }
        });

        animator.setDuration(2000);
        animator.start();
    }

    public void testObjectAnimatorByTranslationX() {
        //translationX translationY translation  平移

        //alphaX alphaY  透明度

        //rotation rotationX rotationY 旋转

        //scaleX scaleY 缩放
        ObjectAnimator animator = ObjectAnimator.ofFloat(mTvTest, "translationZ", 100, 0, 200);

        animator.setDuration(2000);
        animator.start();
    }
}
