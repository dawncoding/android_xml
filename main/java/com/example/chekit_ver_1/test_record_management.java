package com.example.chekit_ver_1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class test_record_management extends AppCompatActivity {
    String test_record_process_date[] = {"6월 17일\n2020", "1월 19일\n2021", "2월 1일\n2020", "1월 19일\n2021", "6월 19일\n2021"};
    String test_record_process_result[] = {"good", "issue", "good", "good", "processing"};
    int test_record_process_image[] = {R.drawable.ic_baseline_mood_24, R.drawable.ic_baseline_mood_bad_24, R.drawable.ic_baseline_mood_24, R.drawable.ic_baseline_mood_bad_24, R.drawable.ic_baseline_hourglass_bottom_24};

    ListView test_record_process_listview;
    test_record_process_adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_record_management);

        //Customizing ActionBar
        Toolbar test_record_management_top = findViewById(R.id.test_record_management_top);
        setSupportActionBar(test_record_management_top);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        //ListView
        test_record_process_listview = findViewById(R.id.test_record_process_listview);
        adapter = new test_record_process_adapter();

        setData();
        test_record_process_listview.setAdapter(adapter);
    }

    void setData() {
        for(int i=0; i<5; i++){
            test_record_process_item data = new test_record_process_item();
            data.setTest_record_process_date(test_record_process_date[i]);
            data.setTest_record_process_image(test_record_process_image[i]);
            data.setTest_record_process_result(test_record_process_result[i]);

            adapter.addItem(data);

        }

    }

}