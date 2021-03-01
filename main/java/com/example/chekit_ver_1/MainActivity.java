package com.example.chekit_ver_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button main_button1 = (Button) findViewById(R.id.main_button1);
        main_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, main_login.class);
                startActivity(intent);
            }
        });

        Button main_button2 = (Button) findViewById(R.id.main_button2);
        main_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, self_test_checklist.class);
                startActivity(intent);
            }
        });

        Button main_button3 = (Button) findViewById(R.id.main_button3);
        main_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, test_record_management.class);
                startActivity(intent);
            }
        });

    }

}