package com.test;

public class MyStack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public MyStack(){

    }
    public MyStack(int val){
        maxSize = val;
        stackArray = new long[maxSize];
        top = -1;
    }
    public void push(long val){
        if (isFull()) {
            System.out.println("栈已满");
            return;
        }
        stackArray[++top] = val;
    }

    public void pop() {
        long l = stackArray[top--];
        System.out.println(l);
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull(){
        return (top == maxSize - 1);
    }
}
