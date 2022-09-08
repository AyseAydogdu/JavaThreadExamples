package com.aydogdu.javase;

/**
 * @Author Ayse Aydogdu
 * @Date 6/27/2022 10:22 AM
 */
public class ThreadExample implements Runnable {

    @Override
    public void run() {
        System.out.println("hi");
    }
}

class ThreadExampleTwo implements Runnable {

    @Override
    public void run() {
        System.out.println("hello");
    }
}
