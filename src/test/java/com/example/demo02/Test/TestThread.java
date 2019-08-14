package com.example.demo02.Test;

public class TestThread {

    public static void main(String[] args) {
        Object object = "xxx";

        Number number = new Number(object);
        Char aChar = new Char(object);

        Thread t1 = new Thread(number);
        Thread t2 = new Thread(aChar);

        t1.start();
        t2.start();
    }
}
