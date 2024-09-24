package com.qf.array;

public class Demo4 {
    public static void main(String[] args) {
        // 动态创建数组:程序动态执行过程中给数组元素赋值
        // 给定长度，不给元素
        int[] arr = new int[3];
        arr[0] = 97;
        arr[1] = 98;
        arr[2] = 99;
        // 静态创建数组：数组创建出来，元素就已经给定
        // 给元素，不给长度
        int[] arr2 = new int[]{97,98,99};
        // 直接取值，元素就是给定值，而不再是默认值
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        // 也可以再次赋值
        arr2[0] = 57;
        arr2[1] = 58;
        arr2[2] = 59;
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);

        // 静态初始化有简化版
        int[] arr3 = {11,22,33};
        System.out.println(arr3[0]);
        arr3[0] = 100;
        System.out.println(arr3[0]);
    }
}
