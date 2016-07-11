package com.example.user.first.Story.Story.PlayerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.user.first.R;
import com.example.user.first.Loading.Parsing.Interface.CTalkGuideLine_List;

/**
 * Created by KICT-15 on 2016-07-08.
 */
public class CStory_Player extends AppCompatActivity {
    ViewPager pager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //타이틀 삭제 시작
        Window win = getWindow();
        win.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        //타이틀 삭제 끝
        setContentView(R.layout.story_player);

        Intent intent = getIntent();
        String url = intent.getStringExtra("m_url");
        Uri uri = Uri.parse(url);
        intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);

        pager = (ViewPager) findViewById(R.id.pager);

        //ViewPager에 설정할 Adapter 객체 생성
        //ListView에서 사용하는 Adapter와 같은 역할.
        //다만. ViewPager로 스크롤 될 수 있도록 되어 있다는 것이 다름
        //PagerAdapter를 상속받은 CustomAdapter 객체 생성
        //CustomAdapter에게 LayoutInflater 객체 전달
        CTalkGuideLine_List adapter = new CTalkGuideLine_List(getLayoutInflater());

        //ViewPager에 Adapter 설정
        pager.setAdapter(adapter);

        Button btnPre = (Button) findViewById(R.id.btn_pre);
        if (btnPre != null) {
            btnPre.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position;
                    position = pager.getCurrentItem();//현재 보여지는 아이템의 위치를 리턴

                    //현재 위치(position)에서 -1 을 해서 이전 position으로 변경
                    //이전 Item으로 현재의 아이템 변경 설정(가장 처음이면 더이상 이동하지 않음)
                    //첫번째 파라미터: 설정할 현재 위치
                    //두번째 파라미터: 변경할 때 부드럽게 이동하는가? false면 팍팍 바뀜
                    pager.setCurrentItem(position - 1, true);
                }
            });
        }
        Button btnNext = (Button) findViewById(R.id.btn_next);
        if (btnNext != null) {
            btnNext.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position;
                    position = pager.getCurrentItem();//현재 보여지는 아이템의 위치를 리턴

                    //현재 위치(position)에서 -1 을 해서 이전 position으로 변경
                    //이전 Item으로 현재의 아이템 변경 설정(가장 처음이면 더이상 이동하지 않음)
                    //첫번째 파라미터: 설정할 현재 위치
                    //두번째 파라미터: 변경할 때 부드럽게 이동하는가? false면 팍팍 바뀜
                    pager.setCurrentItem(position + 1, true);
                }
            });
        }
    }
}
