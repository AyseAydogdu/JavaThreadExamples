package com.aydogdu.javase;

/**
 * @Author Ayse Aydogdu
 * @Date 6/27/2022 10:28 AM
 */
public class ThreadExampleTest {

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadExample());
        thread.start();
        ThreadExampleTwo threadExampleTwo = new ThreadExampleTwo();
        Thread thread2 = new Thread(threadExampleTwo);
        thread2.setPriority(10);
        thread2.start();
    }
}
