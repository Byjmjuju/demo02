package com.example.demo02.Test;

import org.junit.Test;

public class A {

    char cr = 'd';
    char[] ch = {'a','b','c'};

    public static void main(String[] args) {
        A a = new A();
        a.change(a.cr,a.ch);
        System.out.println(a.cr);
        System.out.println(a.ch);
    }
    public void change(char cr,char ch[]){
        cr = 'e';
        ch[0] = 'f';
    }

    @Test
    public void test1(){

        int a = 0,c=0;
        do{
            --c;
        }while (a>0);
        System.out.println(c);
    }
}
