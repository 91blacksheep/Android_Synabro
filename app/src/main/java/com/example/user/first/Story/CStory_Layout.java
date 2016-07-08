package com.example.user.first.Story;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ScrollView;

import com.example.user.first.Home.CHome;
import com.example.user.first.List.CStory_Data;
import com.example.user.first.List.CStory_List;
import com.example.user.first.R;

/**
 * Created by KICT-15 on 2016-07-06.
 */
public class CStory_Layout extends AppCompatActivity {

    Button btnMeStory, btnAll, btnInner, btnEx, btnTop;
    ScrollView scrollView;

    public ListView listView;

    public CStory_List adapter;

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

        setContentView(R.layout.story_layout);

        btnMeStory = (Button)findViewById(R.id.btnMeStory);
        btnMeStory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        adapter = new CStory_List();

        scrollView = (ScrollView)findViewById(R.id.scrView);

        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.flower), "구름아 내마음을 말해줘", "▶ 감정은 무엇일까?", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "내적", "감정");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.flower), "까만구름, 하얀구름", "▶ 우울한 마음", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "내적", "우울");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.flower), "나도 공주!", "▶ 질투", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "내적", "질투");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.flower), "또륵, 또르륵 사탕", "▶ 눈물은 언제 나는 걸까?", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "내적", "눈물");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.flower), "세모야! 굴러봐!", "▶ 미운마음, 미운 친구", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "내적", "미워하는마음");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.flower), "어두운 밤", "▶ 두려움", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "내적", "두려움");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.flower), "콩닥, 철썩 파도", "▶ 심장은 왜 뛰는 걸까?", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "내적", "정서의형성");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.flower), "내 등에 풍선이?! 어떻게 해요?", "▶ 폭력", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "외적", "폭력");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.flower), "띵똥땡똥, 띵똥땡똥", "▶ 가족관계", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "외적", "가족관계");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.flower), "리본 마을", "▶ 소리지르기", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "외적", "소리지르기");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.flower), "마음의 스케치북", "▶ 부정적인 언어 사용", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "외적", "비속어사용");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.flower), "별콩이와 달콩이", "▶ 친구관계", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "외적", "교우관계");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.flower), "손가락 사탕", "▶ 손톱 물어뜯기", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "외적", "습관");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.flower), "야금야금 우걱우걱", "▶ 간식의 남용", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "외적", "간식남용");
        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.flower), "폭폭이의 달리기", "▶ 떼 쓰기", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "외적", "떼쓰기");

        btnAll = (Button)findViewById(R.id.btnAll);
        btnAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setClear();
                adapter.notifyDataSetChanged();
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "구름아 내마음을 말해줘", "▶ 감정은 무엇일까?", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "내적", "감정");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "까만구름, 하얀구름", "▶ 우울한 마음", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "내적", "우울");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "나도 공주!", "▶ 질투", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "내적", "질투");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "또륵, 또르륵 사탕", "▶ 눈물은 언제 나는 걸까?", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "내적", "눈물");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "세모야! 굴러봐!", "▶ 미운마음, 미운 친구", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "내적", "미워하는마음");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "어두운 밤", "▶ 두려움", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "내적", "두려움");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "콩닥, 철썩 파도", "▶ 심장은 왜 뛰는 걸까?", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "내적", "정서의형성");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "내 등에 풍선이?! 어떻게 해요?", "▶ 폭력", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "외적", "폭력");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "띵똥땡똥, 띵똥땡똥", "▶ 가족관계", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "외적", "가족관계");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "리본 마을", "▶ 소리지르기", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "외적", "소리지르기");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "마음의 스케치북", "▶ 부정적인 언어 사용", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "외적", "비속어사용");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "별콩이와 달콩이", "▶ 친구관계", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "외적", "교우관계");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "손가락 사탕", "▶ 손톱 물어뜯기", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "외적", "습관");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "야금야금 우걱우걱", "▶ 간식의 남용", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "외적", "간식남용");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "폭폭이의 달리기", "▶ 떼 쓰기", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "외적", "떼쓰기");
                listView.smoothScrollToPosition(0);
            }
        });

        btnInner = (Button)findViewById(R.id.btnInner);
        btnInner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setClear();
                adapter.notifyDataSetChanged();
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "구름아 내마음을 말해줘", "▶ 감정은 무엇일까?", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "내적", "감정");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "까만구름, 하얀구름", "▶ 우울한 마음", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "내적", "우울");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "나도 공주!", "▶ 질투", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "내적", "질투");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "또륵, 또르륵 사탕", "▶ 눈물은 언제 나는 걸까?", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "내적", "눈물");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "세모야! 굴러봐!", "▶ 미운마음, 미운 친구", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "내적", "미워하는마음");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "어두운 밤", "▶ 두려움", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "내적", "두려움");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "콩닥, 철썩 파도", "▶ 심장은 왜 뛰는 걸까?", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "내적", "정서의형성");
                listView.smoothScrollToPosition(0);
            }
        });

        btnEx = (Button)findViewById(R.id.btnEx);
        btnEx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.setClear();
                adapter.notifyDataSetChanged();
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "내 등에 풍선이?! 어떻게 해요?", "▶ 폭력", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "외적", "폭력");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "띵똥땡똥, 띵똥땡똥", "▶ 가족관계", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "외적", "가족관계");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "리본 마을", "▶ 소리지르기", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "외적", "소리지르기");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "마음의 스케치북", "▶ 부정적인 언어 사용", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "외적", "비속어사용");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "별콩이와 달콩이", "▶ 친구관계", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "외적", "교우관계");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "손가락 사탕", "▶ 손톱 물어뜯기", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "외적", "습관");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "야금야금 우걱우걱", "▶ 간식의 남용", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "외적", "간식남용");
                adapter.addItem(ContextCompat.getDrawable(getApplicationContext(), R.drawable.flower), "폭폭이의 달리기", "▶ 떼 쓰기", "https://www.youtube.com/watch?v=i1jSCpo1Vq0", "외적", "떼쓰기");
                listView.smoothScrollToPosition(0);
            }
        });

        btnTop = (Button)findViewById(R.id.btnTop);
        btnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listView.smoothScrollToPosition(0);
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // get item
                CStory_Data item = (CStory_Data)parent.getItemAtPosition(position);

                Drawable icon = item.Get_m_thumbnail();
                String title = item.Get_m_title();
                String ex = item.Get_m_ex();
                String url = item.Get_m_url();

                 /* TODO */
                Intent intent = new Intent(getApplicationContext(), CStory_Player.class);
                intent.putExtra("m_url", url);
                startActivityForResult(intent, 0);
                finish();
            }
        });
    }
}
