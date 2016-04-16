package com.example.mj.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        ArrayList<Message> arDessert = new ArrayList<Message>();

        arDessert.add(new Message(R.drawable.android, "신승수", "카풀 신청합니다. 연락주세요.", "2016년 4월 8일"));
        arDessert.add(new Message(R.drawable.android, "장민해", "안녕하세요. 목적지가 비슷한데 탑승 가능할까요?", "2016년 4월 13일"));
        arDessert.add(new Message(R.drawable.android, "박현민", "경로보고 쪽지 드렸는데 분당까지 매주 가시나요?", "2016년 4월 17일"));
        arDessert.add(new Message(R.drawable.android, "김수빈", "두 명이서 같이 카풀 신청하려는데 괜찮나요", "2016년 4월 17일"));

        MessageAdapter adapter = new MessageAdapter(this , R.layout.activity_message_c, arDessert);

        ListView list = (ListView) findViewById(R.id.listView_1);
        list.setAdapter(adapter);
    }
}
