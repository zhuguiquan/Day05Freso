package com.bw.day05freso;

import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.drawee.view.SimpleDraweeView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

//    .Fresco的基本使用
//            (1)在Java代码中开始加载图片
//    //加载网络图片的网址
//    Uri uri = Uri.parse("https://raw.githubusercontent.com/facebook/fresco/gh-pages/static/logo.png");
//    //初始化控件
//    SimpleDraweeView draweeView = (SimpleDraweeView) findViewById(R.id.my_image_view);
////加载图片
//draweeView.setImageURI(uri);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Uri parse = Uri.parse("https://raw.githubusercontent.com/facebook/fresco/gh-pages/static/logo.png");


    }
}
