package com.lucaswangdev;

public class Test5 {
    public static void main(String[] args) {
        int ii = 88;
        // int ii 转float
        float ff = ii;

        byte bb = 5;
        // byte转char会报错
//         char cc = bb;

        // byte可以转换成double,输出 5.0
        double dd = bb;
        System.out.println(dd);
    }
}
