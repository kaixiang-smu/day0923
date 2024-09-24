package com.qf.array;
// 数组的原理
public class Demo2 {
    public static void main(String[] args) {
        /**
         * 声明数组，向内存申请一块空间存储数组
         * 创建数组，在堆内存中开辟连续空间
         * 且同时会给数组元素赋初始值
         * 且会根据长度分配下标
         * 且该空间在内存有地址值
         * 最后，将地址值赋值给了数组名
         */
        int[] arr = new int[3];
        // [I@1540e19d
        // [ 一维数组；/ I integer的首字母；/ @地址值分隔符无意义
        // 1540e19d 就是数组在内存的地址值
        System.out.println(arr);
        // 取值
        int a = arr[0];
        System.out.println(a);
        // 赋值
        arr[0] = 1;
        // 再取值
        System.out.println(arr[0]);

        arr[1] = 2;
        System.out.println(arr[1]);
    }
}
