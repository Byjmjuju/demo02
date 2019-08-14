package com.example.demo02.Test;

public class Char implements Runnable{

    Object xxx;

    public Char(Object xxx){
        this.xxx  = xxx;
    }
    @Override
    public void run() {

        synchronized (xxx) {
            for (char i = 'A'; i <= 'Z'; i++) {
                System.out.print(i);
                xxx.notifyAll();

                try {
                    xxx.wait();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            xxx.notifyAll();
        }
    }
}
