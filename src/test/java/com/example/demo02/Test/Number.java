package com.example.demo02.Test;

public class Number implements Runnable{

    Object xxx;
    public Number(Object xxx){

        this.xxx = xxx;
    }
    @Override
    public void run() {

        synchronized (xxx){
        for (int i = 0;i<52;i+=2){

            System.out.print((i+1)+""+(i+2));
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
