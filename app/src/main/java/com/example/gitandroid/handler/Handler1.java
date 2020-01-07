package com.example.gitandroid.handler;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;

import com.example.gitandroid.R;


import java.util.Timer;
import java.util.TimerTask;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Handler1 extends AppCompatActivity {
    //定义切换的图片的数组id
    int[] imgids = new int[]{
            R.drawable.loading_01,R.drawable.loading_03,R.drawable.loading_05,
            R.drawable.loading_07,R.drawable.loading_09,R.drawable.loading_11,
    };
    int imgstart = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView show = findViewById(R.id.imgchange);
        final Handler myhandler = new Handler(){
            @Override
            public void handleMessage(@NonNull Message msg) {
                if (msg.what == 0x123){
                    show.setImageResource(imgids[imgstart++%imgids.length]);
                }
            }
        };
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                myhandler.sendEmptyMessage(0x123);
            }
        },0,1200);

        //使用定时器,每隔200毫秒让handler发送一个空信息

    }
}


