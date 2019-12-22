package com.example.gitandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button gitbutton1,gitbutton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GitButton();
    }

    public void GitButton(){
        gitbutton1 = findViewById(R.id.gitbutton1);
        gitbutton1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.gitbutton1:
//                Intent intent = new Intent(MainActivity.this)
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
