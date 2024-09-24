package com.qf.array;

import java.util.Arrays;

public class Demo9 {
    public static void main(String[] args) {
        int[] arr = {4,2,1,3,5};
        printArr(arr);
        // 排序(从小到大)
        Arrays.sort(arr);
        printArr(arr);

        String s = Arrays.toString(arr);
        System.out.println(s);

        System.out.println(Arrays.toString(arr));
    }
    public static void printArr(int[] arr){
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
            if (i == arr.length-1){
                s+="]";
            }else {
                s+=",";
            }
        }
        System.out.println(s);
    }
}
