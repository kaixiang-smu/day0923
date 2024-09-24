package com.qf.array;

import java.util.Scanner;

public class Demo5 {
    // 数组取最大值
    public static int printMax(){
        int[] arr = {3,2,5,4,6,1,7};
        int max=arr[0]; // 假设第一个最大
        for (int i = 1; i < arr.length; i++) {
            if (max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    // 求一个整数数组的平均值
    public static double printAvg() {
        int[] arr = {3, 2, 5, 4, 6, 1, 7};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        double average = sum / (arr.length * 1.0);
        return average;
    }
    // 有8个评委打分（去掉一个最低分和一个最高分）求平均分？
    public static double score(){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int max = arr[0];
        int min = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max = arr[i];
            }
            if (min>arr[i]){
                min = arr[i];
            }
            sum+=arr[i];
        }
        double avg = (sum-max-min)/((arr.length-2)*1.0);
        return avg;
    }
    // 根据元素找下标(如果有重复元素，找的是第一个出现的元素下标)
    // 自定义一个整数数组arr，读入一个整数n
    // 如果n在数组中存在，则输出n的下标；如果不存在，则输出-1
    public static void printIndexByElement(){
        int[] arr = {1,2,3,4,5,6,7,8,6,10};
        Boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]){
                flag=true;
                System.out.println(i);
                //return;
                break;
            }
        }
        if (!flag){
            System.out.println("-1");
        }
    }
    // 根据下标找元素
    public static void printElementByIndex(int i){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        if (i>=0 && i<arr.length){
            System.out.println(arr[i]);
        }else {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }
    public static void main(String[] args) {
        //int[] arr = {1,2,3,4,5,6};
        // 数组有个属性，length，通过这个属性获得数组的长度
        // int length = arr.length;
        //for (int i = 0; i < arr.length; i++) {
        //    System.out.println(arr[i]);
        //}
        //int max = printMax();
        //System.out.println(max);
        //double average = printAvg();
        //System.out.println(average);
        //double avgScore = score();
        //System.out.println(avgScore);
        //printIndexByElement();
        printElementByIndex(12);
    }
}
