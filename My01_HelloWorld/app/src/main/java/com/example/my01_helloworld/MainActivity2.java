package com.example.my01_helloworld;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    //소스 작성은 onCreate에서 한다.
    //AppConpatActivity를 상속 받았다.
    EditText edtNum;
	int a = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //onCreate 부분은 인스턴스가 최초생성될때 무조건
        //View Widget 들을 찾아서 이벤트를 연결할때 사용함

        //소스와 레이아웃 xml <-> java연결부
        setContentView(R.layout.activity_main);

        Button btnInput = findViewById(R.id.btnInput);
        String msg = "안녕못해요";
	int a = 0;
        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, msg , Toast.LENGTH_SHORT).show();
            }
        });

        Button btnNaver = findViewById(R.id.btnNaver);
        btnNaver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent 어떤 값을 다른 Activity나 Uri를 통해서 새창을 띄울때 사용
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
                startActivity(intent);
            }
        });

        Button btnCall = findViewById(R.id.btnCall);
        //전역변수 Edittext edtNum과 Layout.xml detNum 연결
        edtNum = findViewById(R.id.edtNum);

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //edtNum에 있는 텍스트를 받아와서 String변수에 넣었음
                String phoneNum = "tel:" + edtNum.getText().toString();
                //ACTION_DAIL이라는 동작을 실행시키는데 phoneNum이라는 String변수를 사용함
                Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse(phoneNum));
                startActivity(intent);
            }
        });

        Button btnNew = findViewById(R.id.btnNew);
        btnNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent로 새창을 띄울때는 시작하는 액티비티.this, 새로띄울 액티비티.class
                Toast.makeText(MainActivity2.this, "새창을띄웁니다.", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity2.this, SubActivity.class);
                startActivity(intent);
            }
        });
    }//onCreate


}
