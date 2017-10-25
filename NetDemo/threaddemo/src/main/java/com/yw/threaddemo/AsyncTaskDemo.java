package com.yw.threaddemo;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.TextView;

/**
 * Created by yw on 17/10/25.
 * author jackyang
 * com.yw.threaddemo
 */
public class AsyncTaskDemo extends AsyncTask<String, Integer, String> {
    private Context mContext;
    private View mView;
    private Dialog mDialog;

    public AsyncTaskDemo(Context context, View view) {
        this.mContext = context;
        this.mView = view;
    }

    @Override
    protected void onPreExecute() {
        //在ui线程中执行，ps：先弹一个加载框 表示你正在处理
        super.onPreExecute();
        mDialog =
                new ProgressDialog(mContext);
        mDialog.setTitle("我是一个等待Dialog");
        mDialog.setCancelable(false);
        mDialog.show();
    }

    @Override
    protected void onPostExecute(String s) {
        //在ui线程中执行
        super.onPostExecute(s);
        mDialog.dismiss(); //关闭加载框
        ((TextView)mView).setText(s);
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        //当进度发生改变时，在ui线程中执行
        super.onProgressUpdate(values);
        //模拟 进度
        ((TextView)mView).setText("下载的进度是" + values[0] + "/10");
    }

    @Override
    protected void onCancelled(String s) {
        //在ui中执行，当任务被取消时执行
        super.onCancelled(s);
    }

    @Override
    protected String doInBackground(String... params) {
        //在子线程中执行 返回result onPostExecute得到回调的结果
        try {
           // Thread.sleep(10000); //模拟task
            for (int i = 0; i < 10; i++) {
                publishProgress(new Integer(i));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "我是返回的数据";
    }
}
