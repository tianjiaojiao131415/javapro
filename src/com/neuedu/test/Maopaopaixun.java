package com.neuedu.test;

/**
 * Created by admin on 2020/2/7.
 */
public class Maopaopaixun {
    public static void main(String[] args) {
        int[] array = {34,56,43,21,45,67,21,45,67,89,0,2,54};
        for (int i = 0; i < array.length-1; i++) {
            int flag=0;
            for (int j = 0; j <array.length-1-i ; j++) {
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag++;
                }
            }
            if (flag==0){
                break;
            }
        }
        for ( int a:array){
            System.out.println(a);
        }
    }
}
