package com.purwadhika;

import java.util.Random;
import java.util.Scanner;

public class Practice04GuessNumber {

    private Scanner scanner;

    public void guessNumber() {
        Random random = new Random();
        if(scanner == null) {
            scanner = new Scanner(System.in);
        }
        System.out.print("Masukkan maximum integer tertiggi: ");
        int max = Integer.parseInt(scanner.next());
        scanner.nextLine();
        int randomNumber = random.nextInt(max) + 1;
        int times = 0;
        int guess = 0;

        System.out.println("Welcome to Guess the Number!");
        System.out.println("Select a number between 1 and " + max + ".");
        System.out.println("Take a guess!");

        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            scanner.nextLine();
            times++;

            if (guess < randomNumber) {
                System.out.println("Too low");
            } else if (guess > randomNumber) {
                System.out.println("Too high");
            } else {
                System.out.println("The number of attempts: " + times);
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        Practice04GuessNumber practice04GuessNumber = new Practice04GuessNumber();

        System.out.println("Create a simple number guessing game where the computer generates a random number between 1 and n, and the user tries to guess it. The program should provide hints like \"Too high\" or \"Too low\" after each guess.");
        practice04GuessNumber.guessNumber();
    }
}
