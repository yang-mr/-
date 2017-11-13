package com.example.wws.aidl;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created on 2017/11/13  16:01.
 * Author jackyang
 * ----------------------
 *
 * @Description
 */

public class Book implements Parcelable {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    protected Book(Parcel in) {
        name = in.readString();
        price = in.readInt();
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    /**
     * Author jackyang
     * created 2017/11/13 16:04
     * @desc 对象只支持为 in 的定向 tag  客户端到服务端
     * @return
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(price);
    }

    /**
     * Author jackyang
     * created 2017/11/13 16:06
     * @param
     * @desc 该方法让对象支持 out inout的定向 服务器到客户端
     * @return
     */
    public void readFromParcel(Parcel parcel) {
        name = parcel.readString();
        price = parcel.readInt();
    }
}
