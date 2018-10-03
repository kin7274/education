package com.dreamwalker.diabeteseducation.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

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

<<<<<<< HEAD

    String searchV(){
        // 버전코드와 버전이름을 불러옴
        PackageInfo pi = null;
        try {
            pi = getPackageManager().getPackageInfo(getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        // 이건 버전코드
//        int versionCode = pi.versionCode;
        // 이건 버전네임
        String versionName = pi.versionName;
        String aa;
        if(versionName.equals("1.0")){
            aa = "최신입니다";
        } else {
            aa = "최신이 아니다! 업데이트해줘!";
        }
        return aa;
    }

=======
>>>>>>> parent of 759418a... 오 댓다
    //
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

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                alertDialogBuilder.setTitle("버전체크하겠슴다!")
                        .setMessage("" + searchV())
                        .setPositiveButton("확인", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
//                Toast.makeText(getApplicationContext(), "커스텀 다이얼로그 추가 예정", Toast.LENGTH_SHORT).show();
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
