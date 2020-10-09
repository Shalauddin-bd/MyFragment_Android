package com.example.myfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Communicator {

    FragmentManager manager;
    SecondFragment sf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        FirstFragment firstFragment = new FirstFragment();
        //SecondFragment secondFragment = new SecondFragment();
         sf = new SecondFragment();

        transaction.add( R.id.linearLayoutContainer1, firstFragment,"FirstFragment");
        transaction.add( R.id.linearLayoutContainer2, sf,"SecondFragment");
        transaction.commit();

    }

    @Override
    public void respond(String data) {
         SecondFragment sf = (SecondFragment) manager.findFragmentByTag("SecondFragment");
         sf.changeData(data);
    }
}