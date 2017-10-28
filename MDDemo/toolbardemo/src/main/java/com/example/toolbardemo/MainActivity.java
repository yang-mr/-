package com.example.toolbardemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        mToolbar.setTitle("我是大标题");
        mToolbar.setSubtitle("我是小标题");
        mToolbar.setLogo(R.mipmap.ic_launcher);
        mToolbar.setOverflowIcon(getDrawable(R.mipmap.ic_launcher));  //替换三个点的图片

        setSupportActionBar(mToolbar);
        mToolbar.setNavigationIcon(R.mipmap.ic_launcher_round);

        //设置菜单item点击事件
//        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                Toast.makeText(MainActivity.this, "你点击了标题为 ：" + item.getTitle() + " 的菜单", Toast.LENGTH_SHORT).show();
//                switch (item.getItemId()) {
//                    case R.id.action_search:
//                        break;
//                    default:
//                        break;
//                }
//                return false;
//            }
//        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            Toast.makeText(this, "你点击了导航图标", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "你点击了标题为 ：" + item.getTitle() + " 的菜单", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu); //加载菜单
        return super.onCreateOptionsMenu(menu);
    }
}
