package com.example.chekit_ver_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class self_test_checklist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_test_checklist);

        Button self_test_result = findViewById(R.id.self_test_result);
        self_test_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(self_test_checklist.this, com.example.chekit_ver_1.self_test_result.class);
                startActivity(intent);
            }
        });
    }
}