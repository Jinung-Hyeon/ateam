package com.example.pyunhagae;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AfterLoginActivity extends AppCompatActivity {
    Fragment deviceEnrolFrag;
    Fragment existDeviceFrag;
    Fragment noDeviceFrag;

    BottomNavigationView bottom_navi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);

        deviceEnrolFrag = new DeviceEnrolFrag();
        existDeviceFrag = new ExistDeviceFrag();
        noDeviceFrag = new NoDeviceFrag();

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