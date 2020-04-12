package com.lucaswangdev;

public class Test4 {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.setName("张三");
        System.out.println(hello.getName());
        System.out.println(Utils.getType(hello));
    }
}
