// IUserManager.aidl
package com.example.aidldemo.aidl;

// Declare any non-default types here with import statements

interface IUserManager {
    /**
     * Demonstrates some basic types that you can use as parameters
     * and return values in AIDL.
     */
     List<User> getUsers();
     void addUser(in User user);
}
