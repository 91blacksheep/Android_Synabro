package com.example.user.first.Emotion;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.user.first.Home.CHome;
import com.example.user.first.R;
import com.example.user.first.Setting.CSetting_List;
import com.example.user.first.Story.Story.PlayerView.CStory_Player;
import com.example.user.first.Story.StoryList.View.CStoryListClient;
import com.example.user.first.UiSetting.CMyText;
import com.example.user.first.UiSetting.CTextPosition;

/**
 * Created by USER on 2016-06-26.
 */
public class CEmotion_List extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{

    TextView BtnHappy, BtnSad, BtnPanic, BtnAnger, BtnDisGust;

    String message;

    Toolbar toolbar;
    View nav_header_view;
    TextView nav_header_txt;
    NavigationView navigationView;

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

        /**/
        cTextPosition = new CTextPosition(BtnHappy, BtnSad, BtnPanic, BtnAnger, BtnDisGust, this);

        /* 네비게이션 드로어 초기화 */
        SetNav();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        nav_header_view = navigationView.getHeaderView(0);
        nav_header_txt = (TextView)nav_header_view.findViewById(R.id.mytext);

        /* 나만의 글귀 */
        Intent intent = getIntent();
        message = intent.getStringExtra(CMyText.EXTRA_MESSAGE);
        nav_header_txt.setText(message);
    }

    private void SetNav()
    {
        /**/
        toolbar = (Toolbar)findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);

        DrawerLayout drawer = (DrawerLayout)findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
    }

    public void onClickButton(View v)
    {
        switch(v.getId())
        {
            case R.id.Happy:
                Intent intent1 = new Intent(getApplicationContext(),CHappy.class);
                startActivity(intent1);
                break;
            case R.id.Sad:
                Intent intent2 = new Intent(getApplicationContext(), CSad.class);
                startActivity(intent2);
                break;
            case R.id.Panic:
                Intent intent3 = new Intent(getApplicationContext(),CPanic.class);
                startActivity(intent3);
                break;
            case R.id.Anger:
                Intent intent4 = new Intent(getApplicationContext(),CAnger.class);
                startActivity(intent4);
                break;
            case R.id.DisGust:
                Intent intent5 = new Intent(getApplicationContext(),CDisGust.class);
                startActivity(intent5);
                break;
        }
    }

    @Override
    public void onBackPressed()
    {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START))
        {
            drawer.closeDrawer(GravityCompat.START);
        }
        else
        {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item)
    {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if(id == R.id.nav_home)
        {
            Intent intent = new Intent(getApplicationContext(), CHome.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_storybook)
        {
            Intent intent = new Intent(getApplicationContext(), CStoryListClient.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_emotion_list)
        {
            Intent intent = new Intent(getApplicationContext(), CEmotion_List.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_setting)
        {
            Intent intent = new Intent(getApplicationContext(), CSetting_List.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_btn4)
        {
            Intent intent = new Intent(getApplicationContext(), CStory_Player.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_btn5)
        {

        }
        else if (id == R.id.changetext)
        {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

        return true;
    }
}
