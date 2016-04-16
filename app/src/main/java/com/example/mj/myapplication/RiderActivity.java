package com.example.mj.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by mj on 2016-04-17.
 */
public class RiderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rider);

        ArrayList<Rider> rider = new ArrayList<Rider>();

        rider.add(new Rider(R.drawable.android, "신승수", "카풀 신청합니다. 연락주세요.", "2016년 4월 8일"));
        rider.add(new Rider(R.drawable.android, "장민해", "안녕하세요. 목적지가 비슷한데 탑승 가능할까요?", "2016년 4월 13일"));
        rider.add(new Rider(R.drawable.android, "박현민", "경로보고 쪽지 드렸는데 분당까지 매주 가시나요?", "2016년 4월 17일"));
        rider.add(new Rider(R.drawable.android, "김수빈", "두 명이서 같이 카풀 신청하려는데 괜찮나요", "2016년 4월 17일"));

        RiderAdapter rdapter = new RiderAdapter(this , R.layout.activity_rider_c, rider);

        ListView rlist = (ListView) findViewById(R.id.rider_listView_1);
        rlist.setAdapter(rdapter);

    }
}
