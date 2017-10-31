package com.example.popupwindowdemo;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.SimpleAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private PopupWindow mPopupWindow;
    private Button mBt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBt = (Button) findViewById(R.id.show);

    }

    public void show(View view) {
        if (mPopupWindow == null)
        mPopupWindow = new PopupWindow(this);

        if (mPopupWindow.isShowing()) {
            mPopupWindow.dismiss();
            return;
        }

        View window_view = LayoutInflater.from(this).inflate(R.layout.window_view, null);

        GridView gridView = (GridView) window_view.findViewById(R.id.gridview);

        MyAdapter myAdapter = new MyAdapter(null, this);
        gridView.setAdapter(myAdapter);

        //4者的属性必须设置
        mPopupWindow.setWidth(ViewGroup.LayoutParams.MATCH_PARENT); //设置宽度 布局文件里设置的没有用
        mPopupWindow.setHeight(ViewGroup.LayoutParams.MATCH_PARENT);  //设置高度  必须代码设置
        mPopupWindow.setContentView(window_view);  //设置布局
        //popupWindow.showAsDropDown(window_view);  //设置显示位置

        mPopupWindow.setBackgroundDrawable(new BitmapDrawable());
        mPopupWindow.setOutsideTouchable(true); //外部是否可点击 点击外部消失
        mPopupWindow.setFocusable(true);  //响应返回键  点击返回键 消失

        View parentView = LayoutInflater.from(this).inflate(R.layout.activity_main, null);
        mPopupWindow.showAtLocation(parentView, Gravity.BOTTOM, 0, 0);      //相对父布局
        // mPopupWindow.showAsDropDown(mBt, 0, 0);   //相对某个控件显示
    }

    private class MyAdapter extends BaseAdapter {
        private Context mContext;
        private List<TagBean> mData;
        public MyAdapter() {

        }

        public MyAdapter(List<TagBean> data, Context context) {
            this.mData = data;
            this.mContext = context;
        }

        @Override
        public int getCount() {
            return 8;
        }

        @Override
        public Object getItem(int position) {
            return mData.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder viewHolder = null;
            if (convertView == null) {
                viewHolder = new ViewHolder();
                convertView = LayoutInflater.from(mContext).inflate(R.layout.gridview_item, null);
                viewHolder.imageView = (ImageView) convertView.findViewById(R.id.iv);
                convertView.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) convertView.getTag();
            }

            viewHolder.imageView.setImageResource(R.mipmap.ic_launcher);
            return convertView;
        }

        private class ViewHolder {
            private ImageView imageView;
        }
    }
}
