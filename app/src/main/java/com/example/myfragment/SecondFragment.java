package com.example.myfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class SecondFragment extends Fragment {

    EditText editTextData;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_second, container, false);
        editTextData = view.findViewById(R.id.editTextData);
        return view;
    }

    public void  changeData(String data){
        editTextData.setText(data);
    }
}