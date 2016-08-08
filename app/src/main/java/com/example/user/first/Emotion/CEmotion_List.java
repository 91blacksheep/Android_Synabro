package com.example.user.first.Emotion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.user.first.R;
import com.example.user.first.UiSetting.ToolBarSetting;

/**
 * Created by USER on 2016-06-26.
 */
public class CEmotion_List extends ToolBarSetting
{

    TextView BtnHappy,BtnSad,BtnPanic,BtnAnger,BtnDisGust;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emotion_list_layout);

        toolbar();

        BtnHappy = (TextView)findViewById(R.id.Happy);
        BtnSad = (TextView)findViewById(R.id.Sad);
        BtnPanic = (TextView)findViewById(R.id.Panic);
        BtnAnger = (TextView)findViewById(R.id.Anger);
        BtnDisGust = (TextView)findViewById(R.id.DisGust);

        textposition(BtnHappy, -1, -17);
        textposition(BtnSad, 20, -5);
        textposition(BtnAnger, 13, 13);
        textposition(BtnPanic, -13, 13);
        textposition(BtnDisGust, -20, -5);

        BtnHappy.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(),CHappy.class);
                startActivity(intent);
            }
        });

        BtnSad.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), CSad.class);
                startActivity(intent);
            }
        });

        BtnPanic.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(),CPanic.class);
                startActivity(intent);
            }
        });

        BtnAnger.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(),CAnger.class);
                startActivity(intent);
            }
        });

        BtnDisGust.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(),CDisGust.class);
                startActivity(intent);
            }
        });
    }
}
