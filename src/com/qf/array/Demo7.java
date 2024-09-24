package com.qf.array;

import java.util.Arrays;

public class Demo7 {
    public static void main(String[] args) {
        //copy2();
        copy3();
    }
    public static void printArray(int[] arr){
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
            if (i == (arr.length-1)){
                s+="]";
            }else {
                s+=",";
            }
        }
        System.out.println(s);
    }
    // 数组拷贝方式2
    public static void copy2() {
        int[] arr = {11, 22, 33};
        int[] arr2 = Arrays.copyOf(arr, 3);
        printArray(arr2);
    }
    // 数组拷贝方式3
    public static void copy3() {
        int[] arr = {11, 22, 33, 44, 55};
        int[] arr3 = new int[8];
        printArray(arr3);
        /**
         * Params:
         * src – the source array.
         *       原始数组
         * srcPos – starting position in the source array.
         *       从原数组哪里开始拷贝
         * dest – the destination array.
         *       目的地数组
         * destPos – starting position in the destination data.
         * length – the number of array elements to be copied.
         */
        System.arraycopy(arr,1,arr3,1,3);
        printArray(arr3);
    }
}
