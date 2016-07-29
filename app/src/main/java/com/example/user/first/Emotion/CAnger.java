package com.example.user.first.Emotion;

import android.os.Bundle;

import com.example.user.first.R;
import com.example.user.first.UiSetting.ToolBarSetting;

/**
 * Created by USER on 2016-06-26.
 */
public class CAnger extends ToolBarSetting {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emotion_anger_layout);

        toolbar();
    }
}
