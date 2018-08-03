package com.company;

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        left = null;
        right = null;
    }

    public void add(int element) {
        if (value == element) {
            return;
        } else {

            if (element > value) {
                if (right != null) {
                    right.add(element);

                } else {
                    right = new TreeNode(element);


                    if (left != null) {
                        left.add(element);

                    } else {
                        left = new TreeNode(element);
                    }

                }
            }

        }
    }

    public void print() {
        System.out.println(value);
        if (left != null) {
            left.print();

        }
        if (right != null) {
            right.print();
        }

    }

    public boolean search(int element) {
        if (right == null) {
            return false;
        }
        if (left == null) {
            return false;
        }
        if (value == element) {
            return true;
        } else {
            if (element > value) {
                return  right.search(element);


            }

        }
        if (element < value) {
            return left.search((element));
        }

            return true;
        }

    }





public class Tree {


    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(4);
        treeNode.add(4);
        treeNode.add(3);
        treeNode.add(6);
        treeNode.add(8);
        treeNode.add(9);
        treeNode.add(3);
        treeNode.add(2);
        treeNode.add(8);
        treeNode.print();
        boolean answer = treeNode.search(11);
        System.out.println(answer);

    }


}