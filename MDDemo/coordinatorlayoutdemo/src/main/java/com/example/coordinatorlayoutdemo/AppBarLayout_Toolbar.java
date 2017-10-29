package com.example.coordinatorlayoutdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppBarLayout_Toolbar extends AppCompatActivity {
    private String[] strArray = new String[]{"jack", "rose"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_bar_layout__toolbar);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        List<String> datas = Arrays.asList(strArray);
//        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setAdapter(new MyAdapter(datas));
    }

    private class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
        private List<String> data;
        public MyAdapter(List<String> data) {
            this.data = data;
        }
        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new MyViewHolder(LayoutInflater.from(AppBarLayout_Toolbar.this).inflate(R.layout.recycler_item, parent, false));
        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {
           // holder.mTv.setText(data.get(position));
        }

        @Override
        public int getItemCount() {
            return 100;
        }
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mTv;
        public MyViewHolder(View itemView) {
            super(itemView);

            mTv = (TextView) itemView.findViewById(R.id.tv);
        }
    }
}
