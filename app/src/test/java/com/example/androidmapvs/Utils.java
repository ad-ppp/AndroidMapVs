package com.example.androidmapvs;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;


public class Utils {
    public static void suspend(int second) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            if (countDownLatch.await(second, TimeUnit.SECONDS)) {
                System.out.println("the count reached zero");
            } else {
                System.out.println("the waiting time elapsed before the count reached zero");
            }
        } catch (InterruptedException e) {
            System.out.println("thread interrupt" + e.getMessage());
            Thread.currentThread().interrupt();
        }
    }

    public static void suspend() {
        suspend(10);
    }
}
