package com.lucaswangdev;

public class Test6 {
    public static void main(String[] args) {
        // 不管是什么数据类型，只要跟字符串相连，最终都变成字符串
        String str = 6.66f + "";
        System.out.println(str);
        // 从左往右运算，打印 6Java
        System.out.println(1 + 2 + 3 + "Java");
        // 从左往右运算，全都转成字符串了，打印 Java123
        System.out.println("Java" + 1 + 2 + 3);
    }
}
