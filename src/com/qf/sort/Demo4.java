package com.qf.sort;
// 选择排序进行一次
public class Demo4 {
    public static void main(String[] args) {
        int[] arr = {4,3,1,5,2,7,6};
        printArr(arr);
        sort2(arr);
        printArr(arr);
    }
    public static void sort2(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int minIndex = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[0];
            arr[0] = temp;
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
