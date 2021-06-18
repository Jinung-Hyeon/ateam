package com.example.team_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.team_project.ATask.LoginSelect;
import com.example.team_project.Dto.MemberDTO;

import java.net.URL;
import java.util.concurrent.ExecutionException;

public class LoginActivity extends AppCompatActivity {
    public static MemberDTO loginDTO = null;
EditText main_edt_id,main_edt_pw;
Button main_btn_login,main_btn_signUp;
ImageView login_kakao,login_naver,login_google;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        main_btn_login = findViewById(R.id.main_btn_login);
        main_btn_signUp = findViewById(R.id.main_btn_signUp);
        main_edt_id = findViewById(R.id.main_edt_id);
        main_edt_pw = findViewById(R.id.main_edt_pw);
        login_kakao = findViewById(R.id.login_kakao);
        login_naver = findViewById(R.id.login_naver);
        login_google = findViewById(R.id.login_google);
int a = 0;

        main_btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if(main_edt_id.getText().toString().length() != 0 && main_edt_pw.getText().toString().length() !=0){
                    String id = main_edt_id.getText().toString();
                    String pw = main_edt_pw.getText().toString();     

                    LoginSelect loginSelect = new LoginSelect(id, pw);
                    try {
                        loginSelect.execute().get();
                    } catch (ExecutionException e) {
                        e.getMessage();
                    } catch (InterruptedException e) {
                        e.getMessage();
                    }
                }else{
                    Toast.makeText(LoginActivity.this, "아이디, 비밀번호 모두 입력하세요", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(loginDTO !=null){
                    Toast.makeText(LoginActivity.this, "정상로그인 되었습니다.", Toast.LENGTH_SHORT).show();
                    Log.d("main:login", loginDTO.getId() +"님이 로그인 하였습니다.");

                }else{
                    Toast.makeText(LoginActivity.this, "아이디,비밀번호가 일치하지 않습니다", Toast.LENGTH_SHORT).show();
                    Log.d("main:login", "아이디나 비밀번호 일치안함!");
                    main_edt_id.setText(""); main_edt_pw.setText("");
                    main_edt_id.requestFocus();
                }



            }//onclick
        });
        main_btn_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        login_naver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://nid.naver.com/nidlogin.login?svctype=262144&amp;url=http://undefined/aside/"));
                startActivity(intent);
            }
        });


        login_kakao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://accounts.kakao.com/login?continue=https%3A%2F%2Fkauth.kakao.com%2Foauth%2Fauthorize%3Fproxy%3DeasyXDM_Kakao_emorj2du5zk_provider%26ka%3Dsdk%252F1.40.3%2520os%252Fjavascript%2520sdk_type%252Fjavascript%2520lang%252Fko-KR%2520device%252FWin32%2520origin%252Fhttps%25253A%25252F%25252Fwww.epis.or.kr%26origin%3Dhttps%253A%252F%252Fwww.epis.or.kr%26response_type%3Dcode%26redirect_uri%3Dkakaojs%26state%3Dbba40zjphtqhqs98ql8an4%26client_id%3D950f3ae1f2f550e5ba7ff7d9fffc7781"));
                startActivity(intent);
            }
        });

        login_google.setOnClickListener(new View.OnClickListener() {
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