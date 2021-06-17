package com.example.pyunhagae;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AfterLoginActivity extends AppCompatActivity {
    Fragment deviceEnrolFrag;   //기기등록 프래그먼트
    Fragment existDeviceFrag;   //기기등록후 나오는 프래그먼트
    Fragment noDeviceFrag;      //기기등록 안되어있을때 나올 프래그먼트
    Button btn_logout;  //로그아웃 버튼

    BottomNavigationView bottom_navi;   //바텀메뉴
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);

        deviceEnrolFrag = new DeviceEnrolFrag();
        existDeviceFrag = new ExistDeviceFrag();
        noDeviceFrag = new NoDeviceFrag();

        btn_logout = findViewById(R.id.btn_logout);

        getSupportFragmentManager().beginTransaction().replace(R.id.container, noDeviceFrag).commit();

        //바텀네비게이션 초기화
        bottom_navi = findViewById(R.id.bottom_navi);
        //바텀네비게이션 탭 선택했을때 선택된 프레그먼트가 화면에 나오는 기능
        bottom_navi.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, existDeviceFrag).commit();
                        return true;
                    case R.id.enrolDevice:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, deviceEnrolFrag).commit();
                        return true;
                }

                return false;
            }
        });
    }

}