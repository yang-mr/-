package com.example.wws.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class BookService extends Service {
    List<Book> books;
    private IBinder iBinder = new BookManager.Stub() {
        @Override
        public List<Book> getBooks() throws RemoteException {
            if (books == null) {
                books = new ArrayList<>();
            }
            return books;
        }

        @Override
        public void addBook(Book book) throws RemoteException {
            if (books == null) {
                books = new ArrayList<>();
            }
            books.add(0, book);
            Log.d("yw", books.size() + "");
            String name = book.getName();
        }
    };
    public BookService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return iBinder;
    }
}
