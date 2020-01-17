package com.example.gitandroid.onclick;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

// import android.support.v7.widget.AppCompatButton; 没有引入v7  暂未实现
import androidx.appcompat.widget.AppCompatButton;

import static android.content.ContentValues.TAG;

public class OnClick_btn_hd extends AppCompatButton {

    public OnClick_btn_hd(Context context) {
        super(context);
    }

    public OnClick_btn_hd(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public OnClick_btn_hd(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        super.onTouchEvent(event);
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "onTouchEvent: 方法");
                break;
                default:
        }
        return true;
    }
}
