package com.example.gitandroid.onclick;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.gitandroid.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

//1）直接用匿名内部类
//平时最常用的一种:直接setXxxListener后,重写里面的方法即可; 通常是临时使用一次,复用性不高

public class OnClick_btn extends AppCompatActivity {

    private Button onclick_btn1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onclick_btn);
        onclick_btn1 = findViewById(R.id.onclick_btn1);
        onclick_btn1.setOnClickListener(new View.OnClickListener() {
            //重写点击事件的处理方法onClick()
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"显示按钮'匿名内部类'的内容",Toast.LENGTH_SHORT).show();
            }
        });



    }
}







//2）使用内部类
//和上面的匿名内部类不同哦！ 使用优点:可以在该类中进行复用,可直接访问外部类的所有界面组件！

//public class OnClick_btn extends AppCompatActivity {
//
//    private Button onclick_btn2;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.onclick_btn);
//        onclick_btn2 = findViewById(R.id.onclick_btn2);
//        onclick_btn2.setOnClickListener(new onclick_btn2());
//    }
//    class onclick_btn2 implements View.OnClickListener{
//
//        @Override
//        public void onClick(View v) {
//            Toast.makeText(getApplicationContext(),"显示按钮'使用内部类'的内容",Toast.LENGTH_SHORT).show();
//        }
//    }
//}






//3）使用外部类：
//就是另外创建一个处理事件的Java文件,这种形式用的比较少！
//因为外部类不能直接访问用户界面 类中的组件,要通过构造方法将组件传入使用;这样导致的结果就是代码不够简洁！

//public class OnClick_btn extends AppCompatActivity {
//
//    private Button onclick_btn3;
//    private TextView onclick_btn3_tv;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.onclick_btn);
//        onclick_btn3 = findViewById(R.id.onclick_btn3);
//       onclick_btn3_tv = findViewById(R.id.onclick_btn3_tv);
//       //直接new一个外部类,并把TextView作为参数传入
//        onclick_btn3.setOnClickListener(new Onclick_btn2_class(onclick_btn3_tv));
//    }
//
//}






//4）直接使用Activity作为事件监听器
//只需要让Activity类实现XxxListener事件监听接口,
//在Activity中定义重写对应的事件处理器方法 eg:Actitity实现了OnClickListener接口,
//重写了onClick(view)方法在为某些组建添加该事件监听对象 时,直接setXxx.Listener(this)即可

//public class OnClick_btn extends AppCompatActivity implements View.OnClickListener {
//
//    private Button onclick_btn4;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.onclick_btn);
//        onclick_btn4 = findViewById(R.id.onclick_btn4);
//        //直接写个this
//        onclick_btn4.setOnClickListener(this);
//    }
//    //重写接口中的抽象方法
//    @Override
//    public void onClick(View v) {
//        Toast.makeText(getApplicationContext(),"显示按钮'直接使用Activity作为事件监听器'的内容",Toast.LENGTH_SHORT).show();
//    }
//}






//5）直接绑定到标签:
//就是直接在xml布局文件中对应得Activity中定义一个事件处理方法
//eg:public void myClick(View source) source对应事件源(组件)
//接着布局文件中对应要触发事件的组建,设置一个属性:onclick = "myclick"即可

//public class OnClick_btn extends AppCompatActivity{
//
//    private Button onclick_btn4;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.onclick_btn);
//    }
//    //自定义一个方法,传入一个view组件作为参数
//    public void onclick_btn5(View v) {
//        Toast.makeText(getApplicationContext(),"显示按钮'直接绑定到标签'的内容",Toast.LENGTH_SHORT).show();
//    }
//}






//基于回调的事件处理机制





