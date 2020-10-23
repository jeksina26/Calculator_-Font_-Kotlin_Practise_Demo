package com.example.demo.FirstFile;

public class MyFirstJava {
    public static void main(String[] args){
        int sum = SecondfileKt.add(10,20);
        System.out.println(sum);

        int rect = SecondfileKt.rect(2,3);
        System.out.println(rect);
    }

    public static int getArea(int l ,int b){
        return l*b;
    }
}
