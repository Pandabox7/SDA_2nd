//package com.company;
//
//import com.sun.tools.javac.Main;
//
//public class Main2 {
//
//    public static void main(String[] args) {
//        // write your code here
//        Node correctRoot = new Node(10);
//
//        correctRoot.left = new Node(5);
//        correctRoot.left.left = new Node(2);
//        correctRoot.left.right = new Node(6);
//
//        correctRoot.right = new Node(15);
//        correctRoot.right.left = new Node(12);
//        correctRoot.right.right = new Node(20);
//
//        Node incorrectRoot = new Node(10);
//
//        incorrectRoot.left = new Node(5);
//        incorrectRoot.left.left = new Node(2);
//        incorrectRoot.left.right = new Node(6);
//
//        incorrectRoot.right = new Node(15);
//        incorrectRoot.right.left = new Node(12);
//        incorrectRoot.right.right = new Node(1);
//
//        Main main = new Main();
//        System.out.println("checkBST(correctRoot) = " + main.checkBST(correctRoot));
//        System.out.println("checkBST(incorrectRoot) = " + main.checkBST(incorrectRoot));
//    }
//
//    boolean checkBST(Node root) {
//        return doCheckBST(root, Integer.MIN_VALUE, integer.MAX_VALUE);
//
//    }
//    public class Main {
//
//        public static void main(String[] args) {
//            // write your code here
//            Node correctRoot = new Node(10);
//
//            correctRoot.left = new Node(5);
//            correctRoot.left.left = new Node(2);
//            correctRoot.left.right = new Node(6);
//
//            correctRoot.right = new Node(15);
//            correctRoot.right.left = new Node(12);
//            correctRoot.right.right = new Node(20);
//
//            Node incorrectRoot = new Node(10);
//
//            incorrectRoot.left = new Node(5);
//            incorrectRoot.left.left = new Node(2);
//            incorrectRoot.left.right = new Node(6);
//
//            incorrectRoot.right = new Node(15);
//            incorrectRoot.right.left = new Node(12);
//            incorrectRoot.right.right = new Node(1);
//
//            Main main = new Main();
//            System.out.println("checkBST(correctRoot) = " + main.checkBST(correctRoot));
//            System.out.println("checkBST(incorrectRoot) = " + main.checkBST(incorrectRoot));
//        }
//
//        boolean checkBST(Node root) {
//            if (root == null) {
//                return true;
//            }
//if (node.data < min || node.data > max) {
//    return false;
//            }
//            if (root.left !=null && root.left.data > root.data) {
//                return false;
//            }
//
//            if (root.right != null && root.right.data < root.data) {
//                return false;
//            }
//
//            if (!checkBST(root.left) || !checkBST(root.right)) {
//                return false;
//            }
//
//            return true;
//        }
//return doCheckBST(node.left, , ) && doCheckBST(node.right, ,);
//    }
//
//}