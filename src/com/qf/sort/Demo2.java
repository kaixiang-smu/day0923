package com.qf.sort;
// 冒泡排序
public class Demo2 {
    public static void main(String[] args) {
        int[] arr = {4,3,1,5,2,7,6};
        printArr(arr);
        sort1(arr);
        printArr(arr);
    }
    public static void sort1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
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
