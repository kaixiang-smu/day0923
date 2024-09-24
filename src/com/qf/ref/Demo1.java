package com.qf.ref;

public class Demo1 {
    public static void main(String[] args) {
        //int x = 10;
        //System.out.println("1. " + x);
        //changeBaseValue(x);
        //System.out.println("4. " + x);
        int[] arr = {1,2,3,4};
        System.out.print("第一次：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

        changeRefValue(arr);

        System.out.print("\r\n第四次：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    // 改变基本类型的值(基本类型在传参数时是值传递)
    public static void changeBaseValue(int a){
        System.out.println("2. "+a);
        a*=10;
        System.out.println("3. "+a);
    }
    // 改变引用类型的值(引用类型在传参数时是引用传递(地址传递))
    public static void changeRefValue(int[] arr){
        System.out.print("\r\n第二次：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        // 改变数组（每个值放大10倍）
        System.out.print("\r\n第三次：");
        for (int i = 0; i < arr.length; i++) {
            arr[i]*=10;
            System.out.print(arr[i]+" ");
        }
    }
}
