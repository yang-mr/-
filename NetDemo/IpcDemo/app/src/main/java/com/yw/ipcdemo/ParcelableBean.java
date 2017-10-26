package com.yw.ipcdemo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by yw on 17/10/26.
 * author jackyang
 * com.yw.ipcdemo
 */
public class ParcelableBean implements Parcelable {

    protected ParcelableBean(Parcel in) {
        //从序列化后的对象中创建原始对象
    }

    public static final Creator<ParcelableBean> CREATOR = new Creator<ParcelableBean>() {
        @Override
        public ParcelableBean createFromParcel(Parcel in) {
            //从序列化后的对象中创建原始对象
            return new ParcelableBean(in);
        }

        @Override
        public ParcelableBean[] newArray(int size) {
            //创建指定长度的原始对象数组
            return new ParcelableBean[size];
        }
    };

    @Override
    public int describeContents() {
        //返回当前对象的内容描述 有文件描述符返回1 否则返回0
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        //将当前对象写入序列化结构
    }
}
