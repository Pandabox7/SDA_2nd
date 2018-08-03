//package com.company;
//
//import java.util.Scanner;
//
//public class TwoDimensionalArray {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter array size");
//        int size = scanner.nextInt();
//        int[][] anArray = new int[size][size];
//
//
//        for (int i = 0; i < anArray.length; i++) {
//            for (int j = 0; j < anArray[i].length; j++) {
//                System.out.println(anArray[i][j] + " ");
//            }
//
//
//        }
//        System.out.print(" What number?");
//
//
//        for (int i = 0; i < anArray.length; i++) {
//            for (int j = 0; j < anArray[i].length; j++) {
//                int number = scanner.nextInt();
//                anArray[i][j] = number;
//
//            }
//
//        }
//        for (int i = 0; i < anArray.length; i++) {
//            for (int j = 0; j < anArray[i].length; j++) {
//                if (anArray[i][j] < 0) {
//                    System.out.println();
//                    System.out.print(anArray[i][j] + " ");
//                }
//                System.out.println();
//            }
//
//        }
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < anArray.length; i++) {
//            for (int j = 0; j < anArray[i].length; j++) {
//                if (anArray[i][j] > max) {
//                    max=anArray[i][j];
//
//                }
//
//
//            }
//
//        }
//        System.out.println(max);
//int max1;
//        for (int i = 0; i <anArray.length ; i++) {
//            for (int j = 0; j <anArray[i].length ; j++) {
//                if (anArray<max1[i]){
//
//                }
//            }
//
//        }
//    }
//}