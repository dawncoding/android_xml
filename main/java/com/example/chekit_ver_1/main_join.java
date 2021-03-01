package com.example.chekit_ver_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class main_join extends AppCompatActivity {
    String phone_company;
    Spinner spinner_phone;

    TextView certify_timer_3m;
    CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_join);

        //Setting Spinner
        Spinner spinner_phone = (Spinner)findViewById(R.id.spinner_phone);

        spinner_phone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                phone_company = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                phone_company = parent.getItemAtPosition(0).toString();
            }
        });

        //Phone certification Timer
        certify_timer_3m = findViewById(R.id.certify_timer_3m);
    }
}