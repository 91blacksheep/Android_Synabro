package com.example.user.first.Story;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.user.first.Lib.CViewPager_Adapter;
import com.example.user.first.R;
import com.example.user.first.TalkGuideLine.CTalkGuideLine_List;

/**
 * Created by KICT-15 on 2016-07-08.
 */
public class CStory_Player extends AppCompatActivity
{
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

        pager = (ViewPager)findViewById(R.id.pager);

        //ViewPager에 설정할 Adapter 객체 생성
        //ListView에서 사용하는 Adapter와 같은 역할.
        //다만. ViewPager로 스크롤 될 수 있도록 되어 있다는 것이 다름
        //PagerAdapter를 상속받은 CustomAdapter 객체 생성
        //CustomAdapter에게 LayoutInflater 객체 전달
        CTalkGuideLine_List adapter = new CTalkGuideLine_List(getLayoutInflater());

        //ViewPager에 Adapter 설정
        pager.setAdapter(adapter);

        adapter.addItem("1. 아이와 함께 그동안 솜사탕이 된 기억들을 나눠보세요.");
        adapter.addItem("2. 그 솜사탕을 먹고 생겨난 기억 사탕들도 함께 나눠보세요.");
        adapter.addItem("3. 솜사탕의 변화와 사탕이 섞이면서 색다른 솜사탕이 되고 색다른 기억 사탕이 되는 것을 아이에게 느낄 수 있도록 해주세요.");
        adapter.addItem("4. 아이의 솜사탕도 소중하고 기억 사탕도 소중하지만, 다른 사람들의 솜사탕과\n" +
                "기억 사탕들도 소중하고 섞임ㄴ서 다른 솜사탕이 될 수 있다는 것을 알려주세요. 아마 분명 즐거운 시간이 될 것이예요.");
        adapter.addItem("5. 오늘의 기억들도 솜사탕과 기억 사탕이 되어 아이와 부모님에게 남을 것이랍니다.");
    }

    //onClick속성이 지정된 View를 클릭했을때 자동으로 호출되는 메소드
    public void mOnClick(View v){

        int position;

        switch( v.getId() ){
            case R.id.btn_pre://이전버튼 클릭

                position=pager.getCurrentItem();//현재 보여지는 아이템의 위치를 리턴

                //현재 위치(position)에서 -1 을 해서 이전 position으로 변경
                //이전 Item으로 현재의 아이템 변경 설정(가장 처음이면 더이상 이동하지 않음)
                //첫번째 파라미터: 설정할 현재 위치
                //두번째 파라미터: 변경할 때 부드럽게 이동하는가? false면 팍팍 바뀜
                pager.setCurrentItem(position - 1, true);

                break;

            case R.id.btn_next://다음버튼 클릭

                position=pager.getCurrentItem();//현재 보여지는 아이템의 위치를 리턴

                //현재 위치(position)에서 +1 을 해서 다음 position으로 변경
                //다음 Item으로 현재의 아이템 변경 설정(가장 마지막이면 더이상 이동하지 않음)
                //첫번째 파라미터: 설정할 현재 위치
                //두번째 파라미터: 변경할 때 부드럽게 이동하는가? false면 팍팍 바뀜
                pager.setCurrentItem(position + 1, true);

                break;
        }
    }
}
