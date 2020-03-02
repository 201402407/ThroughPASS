package com.example.throughpass.Main.fragments.ride;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.throughpass.R;


public class RideFragment extends Fragment {

    private View view;
    /*
    * recyclerview생성하기
    * item 선택되면 새로운 Activity 생성하기
    * 페이지가 loading 될 때마다, json으로 DB에서 데이터 받아오기
    *
    */
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_ride, container, false);
        return view;
    }
}