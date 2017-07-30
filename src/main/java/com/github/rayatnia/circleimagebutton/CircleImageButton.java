package com.github.rayatnia.circleimagebutton;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.util.AttributeSet;
import android.widget.ImageButton;

/**
 * Created by Raeyatnia on 06/25/2017.
 */
public class CircleImageButton extends ImageButton{


    public CircleImageButton(Context context) {
        super(context);
        init();
    }

    public CircleImageButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CircleImageButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void init(){
        setScaleType(ScaleType.FIT_CENTER);
        setPadding(0, 0, 0, 0);
        setBackgroundColor(0xffffffff);
    }

    public RoundedBitmapDrawable getRoundDrawable( int drawable){
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), drawable);
        RoundedBitmapDrawable dr =  RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        dr.setCornerRadius(Math.max(getWidth(), getHeight()) / 2.0f);
        dr.setCircular(true);
        return dr;
    }


    @Override
    public void setImageResource(int resId) {
        super.setImageDrawable(getRoundDrawable(resId));
    }

}
