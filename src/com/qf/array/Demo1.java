package com.qf.array;
// 数组的语法
public class Demo1 {
    public static void main(String[] args) {
        // 声明；向JVM内存申请一块空间
        //      空间的类型是int[]，空间的名字是arr1
        // 数据类型[] 数组名;
        int[] arr1;
        double[] arr2;
        String[] arr3;
        // 其他声明方式，不建议使用
        int arr4[];
        // 创建数组
        // 数组名 = new 数据类型[长度];
        arr1 = new int[3];
        arr2 = new double[3];
        arr3 = new String[3];
        // 同时声明并创建数组
        int[] arr5 = new int[3];
        // 读作：在内存中创建了int型数组，长度是3
        // 后将其赋值给int型数组 arr5
        double[] arr6 = new double[3];
        // 数组取值
        // 数据类型 变量名 = 数组名[下标]
        int a1 = arr5[0];
        int a2 = arr5[1];
        int a3 = arr5[2];
        // int a4 = arr5[3];
        // ArrayIndexOutOfBoundsException（数组下标越界异常）
        // 下标从0开始，最大是数组长度-1，如果超出就会报错
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        // 赋值
        // 数组名[下标] = 值
        arr5[0] = 1;
        arr5[1] = 2;
        arr5[2] = 3;
        int a11 = arr5[0];
        int a12 = arr5[1];
        int a13 = arr5[2];
        System.out.println(a11);
        System.out.println(a12);
        System.out.println(a13);
    }
}
