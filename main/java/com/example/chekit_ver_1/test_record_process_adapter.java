package com.example.chekit_ver_1;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class test_record_process_adapter extends BaseAdapter {
    ArrayList<test_record_process_item> test_record_process_items = new ArrayList<>();

    @Override
    public int getCount() {
        return test_record_process_items.size();
    }

    @Override
    public Object getItem(int position) {
        return test_record_process_items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CustomViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.test_record_process_layout, null, false);

            holder = new CustomViewHolder();
            holder.date = (TextView) convertView.findViewById(R.id.test_record_process_date);
            holder.image = (ImageView) convertView.findViewById(R.id.test_record_process_image);
            holder.result = (TextView) convertView.findViewById(R.id.test_record_process_result);
            //holder.button = (Button) convertView.findViewById(R.id.check_test_button);

            convertView.setTag(holder);
        } else {

            holder = (CustomViewHolder) convertView.getTag();
        }

        test_record_process_item item = test_record_process_items.get(position);

        holder.date.setText(item.getTest_record_process_date());
        holder.image.setImageResource(item.getTest_record_process_image());
        holder.result.setText(item.getTest_record_process_result());


        return convertView;
    }

    class CustomViewHolder {
        TextView date;
        ImageView image;
        TextView result;
    }

    void addItem(test_record_process_item item) {
        test_record_process_items.add(item);
    }
}
