package com.example.pyunhagae;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class NoDeviceFrag extends Fragment {
    Button doEnrolDevice;   //기기동록버튼 변수

    ImageView noDevice_frag_iv; //기기등록안된 프래그먼트에 있는 이미지뷰 변수
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.activity_no_device_frag,container,false);
        doEnrolDevice = rootView.findViewById(R.id.btn_doEnrolDevice);
        noDevice_frag_iv = rootView.findViewById(R.id.noDevice_frag_iv);

        return rootView;
    }
}
