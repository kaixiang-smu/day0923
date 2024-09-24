package com.qf.sort;
// 选择排序
public class Demo5 {
    public static void main(String[] args) {
        int[] arr = {4,3,1,5,2,7,6};
        printArr(arr);
        sort2(arr);
        printArr(arr);
    }
    /**
     * 4,3,1,5,2,7,6
     * 1,3,4,5,2,7,6
     * 1,2,4,5,3,7,6
     * 1,2,3,5,4,7,6
     * 1,2,3,4,5,7,6
     * 1,2,3,4,5,7,6
     * 1,2,3,4,5,6,7
     *
     * 6,5,4,3,2,1
     * 1,5,4,3,2,6
     * 1,2,4,3,5,6
     * 1,2,3,4,5,6
     */
    public static void sort2(int[] arr){
        // 每一个元素都进行一躺比较
        for (int i = 0; i < arr.length-1; i++) {
            // 每次假定第i个位置的数最小
            int minIndex = i;
            // 取后续的每个数与假定的最小数比较
            for (int j = i; j < arr.length; j++) {
                // 如果发现后续有哪个数比最小的数还小
                if (arr[j]<arr[minIndex]){
                    // 记录下最小数的下标
                    minIndex = j;
                }
            }
            // 找到最小数后，与第i个位置交换
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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

