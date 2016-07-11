package com.example.user.first.Story.Story.TalkGuideLine.Interface;

import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.user.first.R;
import com.example.user.first.Story.Story.TalkGuideLine.Lib.CTalkGuideLine_Data;

import java.util.ArrayList;

/**
 * Created by KICT-15 on 2016-07-08.
 */
public class CTalkGuideLine_List extends PagerAdapter
{
    LayoutInflater inflater;
    private ArrayList<CTalkGuideLine_Data> talkGuideLineList = new ArrayList<>();

    public CTalkGuideLine_List(LayoutInflater inflater) {
        // TODO Auto-generated constructor stub

        //전달 받은 LayoutInflater를 멤버변수로 전달
        this.inflater = inflater;

        addItem("1. 아이와 함께 그동안 솜사탕이 된 기억들을 나눠보세요.");
        addItem("2. 그 솜사탕을 먹고 생겨난 기억 사탕들도 함께 나눠보세요.");
        addItem("3. 솜사탕의 변화와 사탕이 섞이면서 색다른 솜사탕이 되고 색다른 기억 사탕이 되는 것을 아이에게 느낄 수 있도록 해주세요.");
        addItem("4. 아이의 솜사탕도 소중하고 기억 사탕도 소중하지만, 다른 사람들의 솜사탕과\n" +
                "기억 사탕들도 소중하고 섞임ㄴ서 다른 솜사탕이 될 수 있다는 것을 알려주세요. 아마 분명 즐거운 시간이 될 것이예요.");
        addItem("5. 오늘의 기억들도 솜사탕과 기억 사탕이 되어 아이와 부모님에게 남을 것이랍니다.");
    }

    //PagerAdapter가 가지고 잇는 View의 개수를 리턴
    //보통 보여줘야하는 이미지 배열 데이터의 길이를 리턴
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return talkGuideLineList.size();
    }

    //ViewPager가 현재 보여질 Item(View객체)를 생성할 필요가 있는 때 자동으로 호출
    //쉽게 말해, 스크롤을 통해 현재 보여져야 하는 View를 만들어냄.
    //첫번째 파라미터 : ViewPager
    //두번째 파라미터 : ViewPager가 보여줄 View의 위치(가장 처음부터 0,1,2,3...)
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        // TODO Auto-generated method stub

        View view = null;

        //새로운 View 객체를 Layoutinflater를 이용해서 생성
        //만들어질 View의 설계는 res폴더>>layout폴더>>story_viewpager.xml 레이아웃 파일 사용
        view = inflater.inflate(R.layout.story_viewpager, null);

        //만들어진 View안에 있는 ImageView 객체 참조
        //위에서 inflated 되어 만들어진 view로부터 findViewById()를 해야 하는 것에 주의.
        TextView tv_viewPager= (TextView) view.findViewById(R.id.tv_vp);

        //ImageView에 현재 position 번째에 해당하는 이미지를 보여주기 위한 작업
        //현재 position에 해당하는 이미지를 setting
        CTalkGuideLine_Data listViewPagerItem = talkGuideLineList.get(position);
        tv_viewPager.setText(listViewPagerItem.Get_m_talkGuideLine());

        //ViewPager에 만들어 낸 View 추가
        container.addView(view);

        //Image가 세팅된 View를 리턴
        return view;
    }

    //화면에 보이지 않은 View는파쾨를 해서 메모리를 관리함.
    //첫번째 파라미터 : ViewPager
    //두번째 파라미터 : 파괴될 View의 인덱스(가장 처음부터 0,1,2,3...)
    //세번째 파라미터 : 파괴될 객체(더 이상 보이지 않은 View 객체)
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // TODO Auto-generated method stub

        //ViewPager에서 보이지 않는 View는 제거
        //세번째 파라미터가 View 객체 이지만 데이터 타입이 Object여서 형변환 실시
        container.removeView((View)object);

    }

    //instantiateItem() 메소드에서 리턴된 Ojbect가 View가  맞는지 확인하는 메소드
    @Override
    public boolean isViewFromObject(View v, Object obj) {
        // TODO Auto-generated method stub
        return v == obj;
    }

    public void addItem(String text)
    {
        CTalkGuideLine_Data item = new CTalkGuideLine_Data();

        item.Set_m_talkGuideLine(text);
        /* TODO */

        talkGuideLineList.add(item);
    }
}
