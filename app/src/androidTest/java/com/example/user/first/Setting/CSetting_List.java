package com.example.user.first.Setting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.user.first.R;
import com.example.user.first.Story.Story.PlayerView.CStory_Player;
import com.example.user.first.UiSetting.TextPosition;
import com.example.user.first.UiSetting.ToolBarSetting;

/**
 * Created by USER on 2016-06-26.
 */
public class CSetting_List extends ToolBarSetting {

    TextView btnWording,btnQnA,btnTutorial,btnCreate,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_list_layout);

        toolbar();

        btnWording = (TextView)findViewById(R.id.wording);
        btnQnA = (TextView)findViewById(R.id.QnA);
        btnTutorial = (TextView)findViewById(R.id.tutorial);
        btnCreate = (TextView)findViewById(R.id.create);
        btn5 = (TextView)findViewById(R.id.btn5);

        textposition(btnWording,7,-17);
        textposition(btnQnA,26,-5);
        textposition(btnTutorial,13,13);
        textposition(btnCreate,-6,13);
        textposition(btn5,-13,-5);

        btnWording.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CStory_Player.class);
                startActivity(intent);
            }
        });

        btnQnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CStory_Player.class);
                startActivity(intent);
            }
        });

        btnTutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CStory_Player.class);
                startActivity(intent);
            }
        });

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}
