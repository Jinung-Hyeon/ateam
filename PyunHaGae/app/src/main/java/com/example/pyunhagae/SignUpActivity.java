package com.example.pyunhagae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {
    EditText join_edt_id, join_edt_pw, join_edt_pw_re, join_edt_email, join_edt_mid_num, join_edt_last_num, join_edt_addr_detail;
    Button join_btn_dupCheck, join_btn_addr_search, join_btn_signUp, join_btn_cancel;
    TextView join_tv_addr_num, join_tv_addr;

    Spinner mail_spinner, phone_spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        join_edt_id = findViewById(R.id.join_edt_id);
        join_edt_pw = findViewById(R.id.join_edt_pw);
        join_edt_pw_re = findViewById(R.id.join_edt_pw_re);
        join_edt_email = findViewById(R.id.join_edt_email);
        join_edt_mid_num = findViewById(R.id.join_edt_mid_num);
        join_edt_last_num = findViewById(R.id.join_edt_last_num);
        join_edt_addr_detail = findViewById(R.id.join_edt_addr_detail);

        join_btn_dupCheck = findViewById(R.id.join_btn_dupCheck);
        join_btn_addr_search = findViewById(R.id.join_btn_addr_search);
        join_btn_signUp = findViewById(R.id.join_btn_signUp);
        join_btn_cancel = findViewById(R.id.join_btn_cancel);

        join_tv_addr_num = findViewById(R.id.join_tv_addr_num);
        join_tv_addr = findViewById(R.id.join_tv_addr);

        mail_spinner = findViewById(R.id.join_spin_eamil_addr);
        phone_spinner = findViewById(R.id.join_spin_first_num);

        ArrayAdapter mailAdapter = ArrayAdapter.createFromResource(SignUpActivity.this,R.array.email_addr, android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter phoneAdpater = ArrayAdapter.createFromResource(SignUpActivity.this, R.array.phone_first_num, android.R.layout.simple_spinner_dropdown_item);

        mailAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mail_spinner.setAdapter(mailAdapter); //어댑터에 연결해줍니다.
        phoneAdpater.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        phone_spinner.setAdapter(phoneAdpater); //어댑터에 연결해줍니다.


        /*mail_spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }

        });

        phone_spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }

        });*/

        //아이디 중복검사 버튼 리스너
        join_btn_dupCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //주소검색 버튼 리스너
        //주소검색은 다음 주소검색 API사용하며
        //주소검색후 나온 결과값을 우편번호(join_tv_addr_num), 주소검색(join_tv_addr) TextView에 보여주게 구현
        join_btn_addr_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //회원가입버튼 리스너
        join_btn_signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //취소버튼 리스너
        join_btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });


    }
}