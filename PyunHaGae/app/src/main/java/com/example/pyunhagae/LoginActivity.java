package com.example.pyunhagae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    }
}