package com.zuoyupeng.navigationbar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.ashokvarma.bottomnavigation.BadgeItem;
import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;

public class MainActivity extends AppCompatActivity implements BottomNavigationBar.OnTabSelectedListener{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationBar bar = (BottomNavigationBar) findViewById(R.id.navigation_bar);
        bar.setMode(BottomNavigationBar.MODE_FIXED);
        bar.setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC);
        //设置红点提示数字
        BadgeItem item = new BadgeItem()
                .setBorderWidth(4)
                .setBackgroundColor(Color.BLUE)
                .setText("5")
                .setHideOnSelect(true);
        //设置底部导航栏
        bar.addItem(new BottomNavigationItem(R.mipmap.ic_home_white_24dp,"主页")
                .setActiveColorResource(R.color.orange))
           .addItem(new BottomNavigationItem(R.mipmap.ic_book_white_24dp,"书籍")
                .setActiveColorResource(R.color.teal))
           .addItem(new BottomNavigationItem(R.mipmap.ic_music_note_white_24dp,"音乐")
                .setActiveColorResource(R.color.blue))
           .addItem(new BottomNavigationItem(R.mipmap.ic_tv_white_24dp,"电视")
                .setActiveColorResource(R.color.brown))
           .addItem(new BottomNavigationItem(R.mipmap.ic_videogame_asset_white_24dp,"影音")
                .setActiveColorResource(R.color.grey))
           .setFirstSelectedPosition(0)
                .initialise();
        //点击事件
        bar.setTabSelectedListener(this);
    }

    public void onTabSelected(int i) {
        switch (i){
            case 0:
                Toast.makeText(MainActivity.this, "0", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(MainActivity.this, "3", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                Toast.makeText(MainActivity.this, "4", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public void onTabUnselected(int i) {

    }

    @Override
    public void onTabReselected(int i) {

    }
}
