package com.example.myfragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FirstFragment extends Fragment {

    Communicator com;
    EditText editTextData;
    Button btnSend;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        com = (Communicator) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        editTextData = view.findViewById(R.id.editTextData);
        btnSend = view.findViewById(R.id.buttonSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendData();
            }
        });
        return view;
    }



    public void sendData(){
        com.respond(editTextData.getText().toString());
    }
}