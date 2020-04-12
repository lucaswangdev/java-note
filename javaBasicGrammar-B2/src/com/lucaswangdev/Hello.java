package com.lucaswangdev;

import com.sun.org.apache.bcel.internal.generic.DCONST;

public class Hello {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public static void main(String[] args) {
//        System.out.println("hello");
//
//        System.out.println("I");
//        System.out.println("Love");
//        System.out.println("Java");

        String[] names = {"张三", "李四", "王五"};
        System.out.println(names[1]); // 李四

        int num2 = (int) 3.14;
        System.out.println(num2);

        byte num = 100;
        System.out.println(num);
        byte sum = (byte) (num + 1);
        System.out.println(sum);
        long bigNumber = 777L;
        System.out.println(bigNumber + 1);

    }
}
