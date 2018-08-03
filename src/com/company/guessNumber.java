package com.company;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {


    public static boolean addNumber() {
        int guess = 0;

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int random1 = random.nextInt(10000);

        while (true) {

            System.out.println("Guess number between 0-10000");
            guess = scanner.nextInt();

            if (guess < random1) {
                System.out.println("The number is to low please guess again");

            }
            if (guess > random1) {
                System.out.println("The number is to high please guess again");
                guess = scanner.nextInt();
            }

            if (guess == random1) {
                System.out.println("You guessed right!");
            }

        }

    }


    public static void main(String[] args) {
        addNumber();
    }
}