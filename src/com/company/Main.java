//package com.company;
//
//import java.util.Scanner;
//
//public class com.company.Node.Main {
//
//    public static void main(String[] args) {
//        // write your code here
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please provide  ( or ) ");
//        String str = scanner.nextLine();
//        Stack stack = new Stack (str.length());
//
//        for (int i = 0; i < str.length(); i++) {
//            char currentCharacter = str.charAt(i);
//            if (currentCharacter == '(') {
//                stack.push(currentCharacter);
//            } else {
//                Character popCharacter = stack.pop();
//                if (popCharacter == null) {
//                    System.out.println("ERROR ERROR ERROR");
//                    return;
//                }
//            }
//
//            }
//        if (stack.pop() != null) {
//            System.out.println("Error :(");
//        } else {
//            System.out.println("Sucess!!!");
//        }
//
//}
//
//
//}
