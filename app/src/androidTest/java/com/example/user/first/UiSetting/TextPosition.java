package com.example.user.first.UiSetting;

import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.widget.TextView;

/**
 * Created by Administrator on 2016-07-22.
 */
public class TextPosition extends AppCompatActivity {

    public void textposition(TextView textView,int x, int y){

        //디바이스 크기 불러오기
        DisplayMetrics device = getApplicationContext().getResources().getDisplayMetrics();
        float deviceX = device.widthPixels;
        float deviceY = device.heightPixels;

        textView.setX((deviceX / 100) * x);
        textView.setY((deviceY / 100) * y);
    }
}
