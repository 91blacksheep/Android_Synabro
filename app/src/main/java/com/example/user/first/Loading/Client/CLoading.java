package com.example.user.first.Loading.Client;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.user.first.Home.CHome;
import com.example.user.first.Lib.CFileHelper;
import com.example.user.first.R;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2016-07-22.
 */
public class CLoading extends AppCompatActivity
{
    TextView TView;

    String str;

    public final static String EXTRA_MESSAGE = "unikys.todo.MESSAGE";

    String fileName = "myText.txt";
    File dir = Environment.getExternalStorageDirectory();
    String filePath = dir.getAbsolutePath() + "/" + fileName;
    String encType = "utf-8";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading);

        try
        {
            str = CFileHelper.getInstance().readString(fileName, encType);
        }
        catch (Exception e) {}
        if(str == null)
            str = "Hello World";

        TView = (TextView)findViewById(R.id.loading);
        TView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), CHome.class);
                String message = str;
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
                finish();
            }
        });
    }
}
