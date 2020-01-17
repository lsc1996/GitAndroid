package com.example.gitandroid.onclick;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

import com.example.gitandroid.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OnClick_btn_hd2 extends AppCompatActivity {
    private Button btn_hd2_btn;
    private OnClick_btn_hd onclick_btn_hd_btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onvlick_btn_hd2);
        btn_hd2_btn = findViewById(R.id.btn_hd2_btn);
        onclick_btn_hd_btn = findViewById(R.id.onclick_btn_hd2_btn);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        super.onTouchEvent(event);
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("OnClick_btn_hd2", "onTouchEvent: 的按钮");
                break;
                default:
        }
        return false;
    }
}
