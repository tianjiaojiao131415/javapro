package com.neuedu.test;

/**
 * Created by admin on 2020/2/7.
 * 选择排序
 */
public class Xuanzepaixun {
    public static void main(String[] args) {
        int[] array = {34,56,43,21,45,67,21,45,67,89,0,2,54};
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j]){
                    int temp = array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
