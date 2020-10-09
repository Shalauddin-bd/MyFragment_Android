package com.example.myfragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class SecondFragment extends Fragment {

    EditText editTextData;
    Button btnTabbedPage;

    private Activity activity;

    public SecondFragment(Activity activity) {
        this.activity = activity;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_second, container, false);
        editTextData = view.findViewById(R.id.editTextData);
        btnTabbedPage = view.findViewById(R.id.buttonTabbedPage);
        btnTabbedPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, TabbedActivity.class);
                activity.startActivity(intent);
                activity.finish();
            }
        });
        return view;
    }

    public void  changeData(String data){
        editTextData.setText(data);
    }
}