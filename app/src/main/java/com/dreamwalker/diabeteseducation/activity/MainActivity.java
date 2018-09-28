package com.dreamwalker.diabeteseducation.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.dreamwalker.diabeteseducation.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setToolbar();
        set();
    }

    // 툴바
    public void setToolbar() {
        Toolbar mytoolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(mytoolbar);
        getSupportActionBar().setTitle("");
    }

    // 객체 생성
    public void set() {
        LinearLayout layout1 = (LinearLayout) findViewById(R.id.layout1);
        LinearLayout layout2 = (LinearLayout) findViewById(R.id.layout2);
        layout1.setOnClickListener(this);
        layout2.setOnClickListener(this);
    }

    // 클릭이벤트
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.layout1:
                // 용어 페이지로 이동
                Intent intent_word = new Intent(MainActivity.this, EduWordActivity.class);
                startActivity(intent_word);
                break;
            case R.id.layout2:
                // 메뉴얼 페이지로 이동
                Intent intent_image = new Intent(MainActivity.this, EduPdfActivity.class);
                startActivity(intent_image);
                break;
        }
    }
}