package com.test;

public class Test {
    public static void main(String[] args) {
        MyStack ms = new MyStack(10);
        System.out.println(ms.isEmpty());
        System.out.println(ms.isFull());
        ms.push(1);
        ms.push(2);
        ms.push(3);
        ms.push(4);
        ms.push(5);
        ms.push(6);
        ms.push(6);
        ms.push(6);
        ms.push(6);
        ms.push(6);
        ms.push(6);
        ms.push(6);
        ms.pop();
        ms.pop();
        ms.pop();
        ms.push(6);
        System.out.println(ms.isEmpty());
        System.out.println(ms.isFull());
    }
}
