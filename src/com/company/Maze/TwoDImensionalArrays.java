package com.company.Maze;

public class TwoDImensionalArrays {
    public static void main(String[] args) {
        int[] integers = new int[10];

        for (int integer : integers) {
                System.out.println("Integer = " + integer);

                    }
        for (int i = 0; i <integers.length ; i++) {
            System.out.println("Integer = " + integers[i]);

            System.out.println("----------------------------------------------------");

        }
        int [][] integerTable = new int [10][10];
        int [][] integerTable2 = new int [][]{
                {1,2,3,4,5,56,76},
                {1,2,3,4,5,56,76},
                {1,2,3,4,5,56,76},
                {1,2,3,4,5,56,76},
                {1,2,3,4,5,56,76}

        };

        System.out.println("----------------------------------------------------");


        for (int i = 0; i <integerTable.length ; i++) {
            for (int j = 0; j < integerTable[i].length ; j++) {
                if(i==j){
                    integerTable[i][j]=7;}
                System.out.print(integerTable[i][j]+" ");


            }
            System.out.println();

        }
    }
}
