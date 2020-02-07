package com.neuedu.test;

/**
 * Created by admin on 2020/2/6.
 */
public class Test {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int m= 0;
        for (int i = 0; i <10 ; i++) {
            array[i]=i+1;
        }
        for (int i = 0; i <arr1.length ; i++) {
            arr1[i]=i+1;
            System.out.println(arr1[i]);
            m++;
        }
        for (int i = 0; i <arr2.length ; i++) {
            arr2[i]=i+m+1;
             System.out.println(arr2[i]);
        }
    }
}
