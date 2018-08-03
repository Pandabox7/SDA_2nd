package com.company;

import java.util.Scanner;



public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter size of array");
        int size = sc.nextInt();
        System.out.println("Please enter array");
        int[] array = new int[size];
        //reading array
        for (int i = 0; i < size; i = i + 1) {
            array[i] = sc.nextInt();

        }
        //sorting
        for (int i = 0; i < array.length-1; ++i) {
            for (int j =array.length -1; j >= i +1; j--){
                if(array [j]>array[j-1]){
                    int temp = array [j];
                    array[j] =array[j-1];
                    array[-1] = temp;
                }
            }


                }

                //printing

    }
        }


