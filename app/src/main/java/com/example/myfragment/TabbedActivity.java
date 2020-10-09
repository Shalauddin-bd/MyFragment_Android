package com.example.myfragment;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class TabbedActivity extends AppCompatActivity {

    Button btnHomepage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabbed);

        btnHomepage = findViewById(R.id.buttonHomePage);

        btnHomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TabbedActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}