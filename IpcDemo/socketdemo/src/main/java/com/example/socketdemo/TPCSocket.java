package com.example.socketdemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

/**
 * Created by yw on 2017/10/28.
 */

public class TPCSocket extends Service {
    private boolean mIsServiceDestoryed = false;
    @Override
    public void onCreate() {
        //监听连接的状态
        new TcpThread().start();
        super.onCreate();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onDestroy() {
        mIsServiceDestoryed = true;
        super.onDestroy();
    }

    private class TcpThread extends Thread {
        @Override
        public void run() {
            ServerSocket serverSocket = null;
            try {
                serverSocket = new ServerSocket(8888);
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }

            //接受客户端的请求
            try {
                final Socket socket = serverSocket.accept();

                //回应客户端
                new Thread() {
                    @Override
                    public void run() {
                        try {
                            handleMsg(socket);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }.start();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    private void handleMsg(Socket socket) throws Exception{

            //发送消息
        PrintWriter out = new PrintWriter(
                    new BufferedWriter(new
                            OutputStreamWriter(socket.getOutputStream())), true);

//        BufferedWriter o = new BufferedWriter(new
//                OutputStreamWriter(socket.getOutputStream()));
//        o.write("jfdk");

        //OutputStreamWriter(socket.getOutputStream()))  字符流通向字节流

            //接受消息
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //InputStreamReader(socket.getInputStream())  字节流通向字符流

        out.println("来聊天啊");

        //在服务没有销毁的时候 一直循环处理消息
        while (!mIsServiceDestoryed) {
           try {
               String msg = in.readLine();

               if (msg == null) {
                   //客户端断开了
                   break;
               }
               Log.d("yw", msg);
               //给客户端回消息
               out.println("服务器发来的消息");
           } catch (SocketException e) {
               Log.d("yw", e.getMessage());
               break;
           }
        }

        //关闭资源
        out.close();
        in.close();
        socket.close();
    }
}
