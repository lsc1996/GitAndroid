package com.example.gitandroid.onclick;

import android.view.View;
import android.widget.TextView;

public class Onclick_btn2_class implements View.OnClickListener {

    private TextView textshow;

    //把文本框作为参数传入
    public Onclick_btn2_class(TextView text){
        textshow = text;
    }

    public void onClick(View v) {
        //点击后设置文本框显示的文字
        textshow.setText("显示按钮'使用外部类'的内容");
    }
}
