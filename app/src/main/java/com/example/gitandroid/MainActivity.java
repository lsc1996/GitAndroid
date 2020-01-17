package com.example.gitandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.gitandroid.handler.Handler1;
import com.example.gitandroid.handler.Handler2;
import com.example.gitandroid.onclick.OnClick_btn;
import com.example.gitandroid.ontouch.OnTouchListener_My;
import com.example.gitandroid.practice.Example1;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button gitbutton1,gitbutton2,gitbutton3,gitbutton4,gitbutton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GitButton();
    }

    public void GitButton(){
        gitbutton1 = findViewById(R.id.gitbutton1);
        gitbutton1.setOnClickListener(this);
        gitbutton2 = findViewById(R.id.gitbutton2);
        gitbutton2.setOnClickListener(this);
        gitbutton3 = findViewById(R.id.gitbutton3);
        gitbutton3.setOnClickListener(this);
        gitbutton4 = findViewById(R.id.gitbutton4);
        gitbutton4.setOnClickListener(this);
        gitbutton5 = findViewById(R.id.gitbutton5);
        gitbutton5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.gitbutton1:
                Intent intent = new Intent(MainActivity.this, Example1.class);
                startActivity(intent);
                break;
            case R.id.gitbutton2:
                Intent intent2 = new Intent(MainActivity.this, Handler2.class);
                startActivity(intent2);
                break;
            case R.id.gitbutton3:
                Intent intent3 = new Intent(MainActivity.this, Handler1.class);
                startActivity(intent3);
                break;
            case R.id.gitbutton4:
                Intent intent4 = new Intent(MainActivity.this, OnClick_btn.class);
                startActivity(intent4);
                break;
            case R.id.gitbutton5:
                Intent intent5 = new Intent(MainActivity.this, OnTouchListener_My.class);
                startActivity(intent5);
                break;
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
