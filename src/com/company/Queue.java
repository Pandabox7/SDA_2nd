//package com.company;
//
//public class Queue {
//    private int head;
//    private int tail;
//    private int[] array;
//    private int counter;
//
//    public Queue(int size) {
//        this.array = new int[size];
//        tail = 1;
//        head = 1;
//        counter = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = -1;
//
//        }
//    }
//
//    public void printQueue() {
//        System.out.println("Queue is 3 element long");
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//
//        }
//    }
//
//    public boolean enqueue(int element) {
//        if (counter == array.length) {
//            System.out.println("Enable to insert");
//            return false;
//        }
//        array[tail] = element;
//        tail++;
//        counter++;
//
//        if (tail == array.length) {
//            tail = 0;
//        }
//        printQueue();
//        return true;
//
//    }
//
//    public int dequeue() {
//        if (counter != 0) {
//            System.out.println("Dequeing next number");
//            counter--;
//            int temp;
//            temp = array[head];
//            head++;
//            if (head >= array.length) {
//                head = 0;
//            }
//            return temp;
//
//
//        }
//
//        return 0;
//
//    }
//
//    public static void main(String[] args) {
//        Queue queue = new Queue(3);
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(0);
//        queue.enqueue(4 );
//        queue.dequeue();
//        queue.enqueue(5);
//        queue.printQueue();
//    }
//}
