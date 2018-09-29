package com.dreamwalker.diabeteseducation.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.dreamwalker.diabeteseducation.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setToolbar(); }

    // 툴바
    public void setToolbar() {
        Toolbar mytoolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(mytoolbar);
        getSupportActionBar().setTitle("");
    }

    // 메뉴.xml
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // 앱 평가하기
            case R.id.item1:
                Toast.makeText(getApplicationContext(), "플레이스토어 댓글로 강제이동", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                // 앱 소개 페이지로 이동
                Intent intent = new Intent(MainActivity.this, AppIntroductionActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}