package com.example.pyunhagae;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DeviceEnrolFrag extends Fragment {
    Button btn_iot, btn_phone, btn_link, btn_wifi;  //기기등록 프래그먼트에서 사용되는 변수
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.activity_device_enrol_frag,container,false);
        btn_iot = rootView.findViewById(R.id.btn_iot);
        btn_phone = rootView.findViewById(R.id.btn_phone);
        btn_link = rootView.findViewById(R.id.btn_link);
        btn_wifi = rootView.findViewById(R.id.btn_wifi);

        return rootView;
    }
}
