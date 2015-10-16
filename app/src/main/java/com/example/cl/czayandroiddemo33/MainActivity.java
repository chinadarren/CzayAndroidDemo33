package com.example.cl.czayandroiddemo33;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //创建一个Toast提示信息
                Toast toast = Toast.makeText(MainActivity.this,"简单的提示信息",
                        //设置改Toast提示信息的持续时间
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });
       button2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               //创建一个Toast提示信息
               Toast toast = new Toast(MainActivity.this);
               //设置Toast的显示位置
               toast.setGravity(Gravity.CENTER, 0, 0);
               //创建一个ImageView
               ImageView image = new ImageView(MainActivity.this);
               image.setImageResource(R.drawable.p);
               //创建一个LinearLayout容器
               LinearLayout ll = new LinearLayout(MainActivity.this);
               //想LinearLayout中添加图片、原有的View
               ll.addView(image);
               //创建一个ImageView
               TextView textView = new TextView(MainActivity.this);
               textView.setText("带图片的提示信息");
               //设置文本框字体号的大小和字体颜色
               textView.setTextSize(30);
               textView.setTextColor(Color.MAGENTA);
               ll.addView(textView);
               //设置Toast显示自定义View
               toast.setView(ll);
               //设置Toast的显示时间
               toast.setDuration(Toast.LENGTH_LONG);
               toast.show();
           }
       });

    }

}
