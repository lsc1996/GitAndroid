package com.example.gitandroid.ontouch;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.gitandroid.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OnTouchListener_My extends AppCompatActivity {

    private ImageView imV_Listener;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ontouchlistener_my);
        imV_Listener = findViewById(R.id.OnTouchListener_My);
        imV_Listener.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                Toast.makeText(getApplicationContext(),"你点击了图片",Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
