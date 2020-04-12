package com.lucaswangdev;

public class AutoDataType {
    public static void main(String[] args) {
        // 一个整数，默认就是 int 类型
        // 一个浮点数，默认就是 double 类型

        // 左边是 long 类型，右边是默认的 int 类型，左右不一样
        // 等号代表赋值，将右侧的int常量，交给左侧的long变量进行存储
        // int -> long，符合了数据范围从小到大的要求
        // 这一行代码发生了自动类型转换。
         long num1 = 100;
         System.out.println(num1);
        System.out.println(Utils.getType(num1)); //class java.lang.Long

        // 100 // 左边是double类型，右边是float类型，左右不一样
        // float -> double，符合从小到大的规则
        // 也发生了自动类型转换
         double num2 = 2.5F;
         System.out.println(num2); // 2.5
        System.out.println(Utils.getType(num2)); //class java.lang.Double

        // 左边是float类型，右边是long类型，左右不一样
        // long --> float，范围是float更大一些，符合从 小到大的规则
        float num3 = 30L;
        System.out.println(num3); // 30.0
        System.out.println(Utils.getType(num3)); // class java.lang.Float
    }
}
