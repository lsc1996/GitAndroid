package com.example.gitandroid.handler;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;

import com.example.gitandroid.R;

import java.util.Timer;
import java.util.TimerTask;

import androidx.appcompat.app.AppCompatActivity;

public class Handler1 extends AppCompatActivity {
    //定义切换的图片的数组id
    int imgids[] = new int[]{
            R.mipmap.loading_01,R.mipmap.loading_03,R.mipmap.loading_05,
            R.mipmap.loading_07,R.mipmap.loading_09,R.mipmap.loading_11,
    };
    int imgstart = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView imgchange = (ImageView) findViewById(R.id.imgchange);
        final Handler myHandler = new Handler()
        {
            @Override
            //重写handleMessage方法,根据msg中what的值判断是否执行后续操作
            public void handleMessage (Message msg){
            if (msg.what == 0x123) {
                imgchange.setImageResource(imgids[imgstart++ % imgids.length]);
            }
        }

        };

        //使用定时器,每隔200毫秒让handler发送一个空信息
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                myHandler.sendEmptyMessage(0x123);

            }
        }, 0,200);
    }
}


