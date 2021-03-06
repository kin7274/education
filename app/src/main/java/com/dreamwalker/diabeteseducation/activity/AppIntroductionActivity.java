package com.dreamwalker.diabeteseducation.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.dreamwalker.diabeteseducation.R;
import com.dreamwalker.diabeteseducation.introduction.ChangeLogActivity;
import com.dreamwalker.diabeteseducation.introduction.DevelopActivity;
import com.dreamwalker.diabeteseducation.introduction.IntroActivity;

public class AppIntroductionActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_introduction);
        set();
        setStatusbar();
    }

    // 객체 생성
    public void set() {
        TextView menu1 = (TextView) findViewById(R.id.menu1);
        TextView menu2 = (TextView) findViewById(R.id.menu2);
        TextView menu3 = (TextView) findViewById(R.id.menu3);
        TextView menu4 = (TextView) findViewById(R.id.menu4);
        menu1.setOnClickListener(this);
        menu2.setOnClickListener(this);
        menu3.setOnClickListener(this);
        menu4.setOnClickListener(this);
    }

    // 상태바 색 변경
    public void setStatusbar(){
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(getResources().getColor(R.color.colorPrimaryPurle));
    }

    // 클릭 이벤트
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.menu1:
                // 1번 메뉴 : 당뇨그루에 대해
                Intent Intro_Intent = new Intent(AppIntroductionActivity.this, IntroActivity.class);
                startActivity(Intro_Intent);
                break;
            case R.id.menu2:
                // 2번 메뉴 : 앱버전 정보
                Toast.makeText(getApplicationContext(), "커스텀 다이얼로그 추가 예정", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menu3:
                // 3번 메뉴 : 개발자 정보
                // 뷰홀더 형식을 생각하자!
                Intent developer_Intent = new Intent(AppIntroductionActivity.this, DevelopActivity.class);
                startActivity(developer_Intent);
                break;
            case R.id.menu4:
                // 4번 메뉴 : Change log
                // 변경 내용
                Intent changeLogIntent = new Intent(AppIntroductionActivity.this, ChangeLogActivity.class);
                startActivity(changeLogIntent);
                break;
        }
    }
}
