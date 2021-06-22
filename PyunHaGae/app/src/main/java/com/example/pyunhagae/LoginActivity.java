package com.example.pyunhagae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {
    EditText main_edt_id, main_edt_pw;  //EditText 아이디, 비밀번호
    ImageView logo_naver, logo_kakao, logo_google;  //로고 이미지뷰
    Button main_btn_login, main_btn_signUp; //로그인, 회원가입 버튼
    CheckBox main_autoLogin_chk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        main_edt_id = findViewById(R.id.main_edt_id);
        main_edt_pw = findViewById(R.id.main_edt_pw);

        logo_google = findViewById(R.id.logo_google);
        logo_kakao = findViewById(R.id.logo_kakao);
        logo_naver = findViewById(R.id.logo_naver);

        main_btn_login = findViewById(R.id.main_btn_login);
        main_btn_signUp = findViewById(R.id.main_btn_signUp);

        main_autoLogin_chk = findViewById(R.id.main_autoLogin_chk);

        //로그인 버튼 클릭 이벤트
        main_btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                Intent intent = new Intent(LoginActivity.this, AfterLoginActivity.class);
                startActivity(intent);
            }
        });

        //회원가입 버튼 클릭 이벤트
        main_btn_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });

        //네이버 이미지 클릭
        logo_naver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://nid.naver.com/nidlogin.login?svctype=262144&amp;url=http://undefined/aside/"));
                startActivity(intent);
            }
        });

        //카카오 이미지 클릭
        logo_kakao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://accounts.kakao.com/login?continue=https%3A%2F%2Fkauth.kakao.com%2Foauth%2Fauthorize%3Fproxy%3DeasyXDM_Kakao_emorj2du5zk_provider%26ka%3Dsdk%252F1.40.3%2520os%252Fjavascript%2520sdk_type%252Fjavascript%2520lang%252Fko-KR%2520device%252FWin32%2520origin%252Fhttps%25253A%25252F%25252Fwww.epis.or.kr%26origin%3Dhttps%253A%252F%252Fwww.epis.or.kr%26response_type%3Dcode%26redirect_uri%3Dkakaojs%26state%3Dbba40zjphtqhqs98ql8an4%26client_id%3D950f3ae1f2f550e5ba7ff7d9fffc7781"));
                startActivity(intent);
            }
        });

        //구글 이미지 클릭
        logo_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://accounts.google.com/signin/v2/identifier?passive=1209600&continue=https%3A%2F%2Fcontacts.google.com%2F%3Fhl%3Dko&followup=https%3A%2F%2Fcontacts.google.com%2F%3Fhl%3Dko&hl=ko&flowName=GlifWebSignIn&flowEntry=ServiceLogin"));
                startActivity(intent);
            }
        });
    }//oncreate
}//class