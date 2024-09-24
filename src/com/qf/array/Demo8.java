package com.qf.array;
// 数组扩容
public class Demo8 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        printArray(arr);
        arr = changeLength(arr);
        printArray(arr);
    }
    public static int[] changeLength(int[] arr){

        // 扩容：新建+拷贝+改名
        int[] arr2 = new int[arr.length * 2];
        System.arraycopy(arr,0,arr2,0,arr.length);
        return arr2;
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
