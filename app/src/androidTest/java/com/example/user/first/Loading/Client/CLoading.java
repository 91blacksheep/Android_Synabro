package com.example.user.first.Loading.Client;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.user.first.Home.CHome;
import com.example.user.first.R;

/**
 * Created by Administrator on 2016-07-22.
 */
public class CLoading extends AppCompatActivity {

    TextView TView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading);

        TView = (TextView)findViewById(R.id.loading);
        TView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(),CHome.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
