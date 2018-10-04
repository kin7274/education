package com.dreamwalker.diabeteseducation.introduction;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dreamwalker.diabeteseducation.R;

import java.util.ArrayList;
import java.util.List;

public class DevelopActivity extends AppCompatActivity {
    private MyRecyclerAdapter mAdapter;
    RecyclerView recyclerView;
    List<CardItem> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_develop);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(false);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<CardItem> dataList = new ArrayList<>();
        // dataList.add(new CardItem("이미지", "이름", "학력", "이메일", "전화번호x -> 깃허브 주소?", "담당"));
        dataList.add(new CardItem(getResources().getString(R.string.develop_name0), getResources().getString(R.string.develop_grade0), getResources().getString(R.string.develop_email0), "https://github.com/ABDABD", getResources().getString(R.string.develop_assign0)));
        dataList.add(new CardItem(getResources().getString(R.string.develop_name1), getResources().getString(R.string.develop_grade1), getResources().getString(R.string.develop_email1), "https://github.com/kin7274", getResources().getString(R.string.develop_assign1)));
        mAdapter = new MyRecyclerAdapter(dataList);
        recyclerView.setAdapter(mAdapter);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getApplicationContext(), new LinearLayoutManager(this).getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
    }
}
