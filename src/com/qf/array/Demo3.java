package com.qf.array;

public class Demo3 {
    public static void main(String[] args) {
        double[] dArr = new double[3];
        System.out.println(dArr[0]);
        System.out.println(dArr[1]);
        System.out.println(dArr[2]);
        dArr[0] = 1.1;
        dArr[1] = 2.2;
        dArr[2] = 3.3;
        System.out.println(dArr[0]);
        System.out.println(dArr[1]);
        System.out.println(dArr[2]);

        String[] sArr = new String[3];
        System.out.println(sArr[0]);// 引用类型的默认初始值为null
        System.out.println(sArr[1]);
        System.out.println(sArr[2]);

        sArr[0] = "a";
        sArr[1] = "b";
        sArr[2] = "c";
        System.out.println(sArr[0]);
        System.out.println(sArr[1]);
        System.out.println(sArr[2]);
    }
}
