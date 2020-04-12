package com.lucaswangdev;

public class Test8 {
    public static void main(String[] args) {
        System.out.println(6 > 3 && '7' > 22);
        System.out.println(6 >= 7 || 'h' > 'b');
        System.out.println(6 >= 7 ^ 'h' > 'b');
        int a = 6;
        int b = 12;
        if (a > 3 | b++ > 12) {
            System.out.println("a 的值：" + a);
            System.out.println("b 的值：" + b);
        }
        int c = 6;
        int d = 12;
        if (c > 3 || d++ > 12) {
            System.out.println("c 的值：" + c);
            System.out.println("d 的值：" + d);
        }

    }
}
