package com.lucaswangdev;

public class Increments {
    public static void main(String[] args) {
        int a = 66;
        // 先将 a 的值，放入表达式中进行运算，然后再给 a 加 1
        int b = a++ + 10;
        // 先将 a 加上 1，然后将新得到的值，再放入表达式中进行运算
        int c = ++a + 10;
        System.out.println("a = " + a); // 68
        System.out.println("b = " + b); // 76
        System.out.println("c = " + c); // 78
    }
}
