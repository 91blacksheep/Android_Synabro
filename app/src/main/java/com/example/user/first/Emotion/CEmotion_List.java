package com.example.user.first.Emotion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.user.first.R;
import com.example.user.first.UiSetting.CTextPosition;
import com.example.user.first.UiSetting.ToolBarSetting;

/**
 * Created by USER on 2016-06-26.
 */
public class CEmotion_List extends AppCompatActivity
{

    TextView BtnHappy, BtnSad, BtnPanic, BtnAnger, BtnDisGust;
    CTextPosition cTextPosition = null;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emotion_list_layout);

        BtnHappy = (TextView)findViewById(R.id.Happy);
        BtnSad = (TextView)findViewById(R.id.Sad);
        BtnPanic = (TextView)findViewById(R.id.Panic);
        BtnAnger = (TextView)findViewById(R.id.Anger);
        BtnDisGust = (TextView)findViewById(R.id.DisGust);

        cTextPosition = new CTextPosition(BtnHappy, BtnSad, BtnPanic, BtnAnger, BtnDisGust, this);

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
