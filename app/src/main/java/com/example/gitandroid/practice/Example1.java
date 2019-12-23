package com.example.gitandroid.practice;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.gitandroid.R;

public class Example1 extends AppCompatActivity {

    private Button button_toast,return1,intent1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.example1);
        intent1 = findViewById(R.id.intent1);
        intent1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Example1.this,Example2.class);
                startActivity(intent1);
//                Intent intent = new Intent("com.example.activitytest.ACTION_START");
////                intent.addCategory("com.example.activitytest.MY_CATEGORY");
//                startActivity(intent);
            }
        });
        return1 = findViewById(R.id.return1);
        return1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        button_toast = findViewById(R.id.button_toast);
        button_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Example1.this,"Toast是一种提醒方式:Ctrl+O",Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
//        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"添加add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"移除",Toast.LENGTH_SHORT).show();
                break;
                default:
        }
        return true;
//        return super.onOptionsItemSelected(item);
    }
}
