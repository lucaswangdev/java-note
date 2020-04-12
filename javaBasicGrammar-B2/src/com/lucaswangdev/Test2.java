package com.lucaswangdev;

public class Test2 {
    public static void main(String[] args) {
        int ii = 88;
        float ff = ii;
//        boolean flag = ff instanceof Float;
        System.out.println(ff);

        Integer dd = 100;

        System.out.println(byte.class.isPrimitive());
        System.out.println(short.class.isPrimitive());
        System.out.println(int.class.isPrimitive());
        System.out.println(long.class.isPrimitive());
        System.out.println(float.class.isPrimitive());
        System.out.println(double.class.isPrimitive());
        System.out.println(char.class.isPrimitive());
        System.out.println(boolean.class.isPrimitive());
        System.out.println(void.class.isPrimitive());
        System.out.println(Integer.class.isPrimitive());
        System.out.println(dd.getClass().getName());
    }
}
