package com.lucaswangdev;

public class Test7 {
    public static void main(String[] args) {
        // 加法
        int a = 11;
        int b = 12;
        int sum = a + b;

        //减法
        int c = 15;
        int d = 10;
        int sub = c - d;

        // 乘法
        int e = 2;
        int f = 3;
        int multiply = e * f;

        // 除法
        int g = 18;
        int h = 9;
        int div = g / h;
        System.out.println("div = " +div);

        double i = 3.0;
        double j = g / i;
        System.out.println("j = " + j);

        //如果除数是0.0，则得到正无穷大， Infinity
        //如果除数是-0.0，则得到负无穷大， -Infinity
        double k = g / 0.0;
        System.out.println("k = " + k); // k = Infinity

        // java.lang.ArithmeticException: / by zero
        //int l = g / 0;
        //System.out.println("l = " + l);

        // 取余
        // 前者除以后者，得到一个整除的结果后剩下的值就是余数
        int m = 5;
        int n = 2;
        int o = m % n;
        System.out.println("o = " + o);

        // 对 0.0 求余，则得到非数
        Object p = m % 0.0;
        System.out.println("p = " + p);

    }
}
