package com.example.myfragment;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class TabbedActivity extends AppCompatActivity {

    TabOneFragment oneFragment;
    TabTwoFragment twoFragment;
    Button btnHomepage, btnTabOne, btnTabTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed);

        btnHomepage = findViewById(R.id.buttonHomePage);
        btnTabOne = findViewById(R.id.buttonTabOne);
        btnTabTwo = findViewById(R.id.buttonTabTwo);

        oneFragment = new TabOneFragment();
        twoFragment = new TabTwoFragment();

//        transaction.add( R.id.linearLayoutContainer1, oneFragment,"FirstFragment");
//        transaction.add( R.id.linearLayoutContainer2, twoFragment,"SecondFragment");
//        transaction.commit();


        btnHomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TabbedActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnTabOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager   manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.add( R.id.linearLayoutContainerTabbedActivity, oneFragment,"FirstFragment");
                transaction.commit();
            }
        });

        btnTabTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager   manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.add( R.id.linearLayoutContainerTabbedActivity, twoFragment,"SecondFragment");
                transaction.commit();
            }
        });


    }
}