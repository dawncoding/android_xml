package com.example.chekit_ver_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ExpandableListAdapter;
import android.widget.TextView;

import com.ms.square.android.expandabletextview.ExpandableTextView;

import iammert.com.expandablelib.ExpandCollapseListener;
import iammert.com.expandablelib.ExpandableLayout;
import iammert.com.expandablelib.Section;

public class self_test_result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_test_result);

        //Customizing ActionBar
        Toolbar self_test_top = findViewById(R.id.self_test_result_top);
        setSupportActionBar(self_test_top);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        //Modify Result TextView
        TextView textview_self_test_result = (TextView) findViewById(R.id.textview_self_test_result);
        int result = 2;
        String test_result = String.format("6개의 증상 중\n총 %d개의 증상을 겪고 계시네요.\n\n정확한 검진을 위해\n검사 및 진료를 권해드립니다.", result);

        textview_self_test_result.setText(test_result);

        //Recylcler View
        ExpandableTextView expandableTextView = findViewById(R.id.expandable_text_view);
        String test_result_text = new String("성병의 주요증상은 무엇인가요?\n\n성병의 주요 증상과 관련한 내용이 들어갑니다.\n성병의 주요 증상과 관련한 내용이 들어갑니다.");
        expandableTextView.setText(test_result_text);

    }
}