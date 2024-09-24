package com.qf.sort;
// 冒泡排序交换一次的
public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {4,3,1,5,2};
        printArray(arr);
        sort1(arr);
        printArray(arr);
    }
    // 升序排序：1，2，3，4，5
    /**
     * 冒泡排序算法，思路
     * 相邻两个比较，通过交换位置，大的放后面
     */
    public static void sort1(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
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
}
