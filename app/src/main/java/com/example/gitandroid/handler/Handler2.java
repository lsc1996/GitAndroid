package com.example.gitandroid.handler;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.gitandroid.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Handler2 extends AppCompatActivity implements View.OnClickListener {
    private static final int CHANGE_TEXT = 1;
    private Button handler_btn;
    private EditText handler_et;
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case CHANGE_TEXT:
                    //在这里进行UI操作
                    handler_et.setText("输入的值");
                    break;
                    default:
                        break;
            }
        }
    };
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.handler2);
        handler_et = findViewById(R.id.handler_et);
        handler_btn = findViewById(R.id.handler2_btn);
        handler_btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.handler2_btn:
                //开启一个子线程
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        //新建一个Message对象,存储需要发送的消息
                        Message message = new Message();
                        message.what = CHANGE_TEXT;
                        //然后将消息发送出去
                        handler.sendMessage(message);
                    }
                }).start();
                break;
                default:
                    break;
        }
    }
}
