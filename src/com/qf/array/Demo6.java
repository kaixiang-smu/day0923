package com.qf.array;
// 数组拷贝
public class Demo6 {
    public static void main(String[] args) {
        copy1();
    }
    public static void copy1(){
        int[] arr = {11,22,33};
        // 数组拷贝，拷贝完需要再有一个数组
        int[] arr2 = new int[arr.length];
        printArray(arr2);
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        printArray(arr2);
    }
    // 定义一个方法，方便数组遍历
    public static void printArray(int[] arr){
        //System.out.print("[");
        //for (int i = 0; i < arr.length; i++) {
        //    System.out.print(arr[i]+" ");
        //}
        //System.out.println("]");
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
