package com.lucaswangdev;

public class MathTest {
    public static void main(String[] args) {
        int a = 12;
        // 乘方
        double b = Math.pow(a, 10);
        // 平方根
        double c = Math.sqrt(a);
        // 随机数
        double d = Math.random();
        // 三角函数：sin
        double e = Math.sin(2.34);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
//        a = 12
//        b = 6.1917364224E10
//        c = 3.4641016151377544
//        d = 0.24282712973853993
//        e = 0.7184647930691261

        int year = 2020;
        String str = "年";
        System.out.println(year + str);
    }
}
