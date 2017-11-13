// BookManager.aidl
package com.example.wws.aidl;

// Declare any non-default types here with import statements
import com.example.wws.aidl.Book;

interface BookManager {
    List<Book> getBooks();

    void addBook(inout Book book);
}
