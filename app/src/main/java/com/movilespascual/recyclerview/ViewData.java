package com.movilespascual.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ViewData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_data);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String tel = intent.getStringExtra("tel");;
        String email = intent.getStringExtra("email");;
        String city = intent.getStringExtra("City");;

        TextView nameTextView = findViewById(R.id.nameTextView);
        TextView telTextView = findViewById(R.id.telTextView);
        TextView emailTextView = findViewById(R.id.emailTextView);
        TextView cityTextView = findViewById(R.id.cityTextView);

        nameTextView.setText(name);
        telTextView.setText(tel);
        emailTextView.setText(email);
        cityTextView.setText(city);
    }
}