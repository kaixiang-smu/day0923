package com.qf.sort;
// 冒泡排序优化
public class Demo3 {
    public static void main(String[] args) {
        int[] arr = {4,3,1,5,2,7,6};
        printArr(arr);
        sort1(arr);
        printArr(arr);
    }
    /**
     * 冒泡排序算法，思路
     * 相邻两个比较，通过交换位置，大的放后面
     */
    public static void sort1(int[] arr){
        // 外层循环 比较的趟数
        // -1 最后一趟不用比较
        for (int i = 0; i < arr.length-1; i++) {
            // 内层循环 每趟内比较的次数
            // -1 防止下标越界
            // -i 每趟比较的次数要递减
            for (int j = 0; j < arr.length-1-i; j++) {
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
