package com.example.yw.javademo.多线程.Executor;

import com.example.yw.javademo.多线程.copyonwritearraylist.ReadThread;

import java.util.Random;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created on 2017/11/20  15:24.
 * Author jackyang
 * ----------------------
 *
 * @Description
 */

public class ExecutorMain {
     public static void main(String[] args) {
        /* AbstractExecutorService
         AbstractExecutorService

         ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();

         Executors.newSingleThreadExecutor()*/

        // testScheduledExecutorService();

     //    testCachedThreadPool();

        // testSingleThreadExecutor();
         
         testExecutorCompletionService();
     }

    private static void testExecutorCompletionService() {
         ExecutorService executorService = Executors.newFixedThreadPool(10);
        CompletionService completionService = new ExecutorCompletionService(executorService);
        for (int i = 0; i < 10; i++) {
            final int result = i;
            completionService.submit(new Callable() {
                @Override
                public Object call() throws Exception {
                    Thread.sleep(new Random().nextInt(5000));   //让当前线程随机休眠一段时间
                    return result;
                }
            });
        }
        try {
            System.out.println(completionService.take().get());   //获取执行结果
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static void testSingleThreadExecutor() {
         ExecutorService executorService = Executors.newSingleThreadExecutor();
         Future<String> future = executorService.submit(new Callable<String>() {
             @Override
             public String call() throws Exception {
                 return "MOBIN";
             }
         });

        try {
            System.out.println(future.get() + " ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static void testCachedThreadPool() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            final int t = i;
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println("thread name: " + Thread.currentThread().getName() + "-- i :" + t);
                }
            };
            executorService.execute(runnable);
        }
    }

    private static void testScheduledExecutorService() {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
        Runnable task = new Runnable() {
        public void run() {
                 System.out.println("HeartBeat.........................");
                }
         };
        executor.scheduleAtFixedRate(task,5,3, TimeUnit.SECONDS);   //5秒后第一次执行，之后每隔3秒执行一次
    }
}
