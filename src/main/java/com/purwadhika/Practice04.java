package com.purwadhika;

import java.util.Random;
import java.util.Scanner;

public class Practice04 {

    private Scanner scanner;

    public void printMultiplicationTable(int n) {
        if(n < 1) {
            throw new IllegalArgumentException("n must be more than 0");
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(i * (j+ 1));
                if(j < n - 1) {
                    System.out.print(" ");
                }
            }
            if(i < n) {
                System.out.println();
            }
        }
    }

    public void printStar(int n) {
        if(n < 1) {
            throw new IllegalArgumentException("n must be more than 0");
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            if(i < n) {
                System.out.println();
            }
        }
    }

    public void readNumber() {
        if(scanner == null) {
            scanner = new Scanner(System.in);
        }
        String numbers = "";
        char choice;

        do {
            System.out.print("Masukkan angka: ");
            int num = scanner.nextInt();
            scanner.nextLine();
            if (numbers.length() > 0) {
                numbers += ",";
            }
            numbers += num;

            System.out.print("Tekan 'y' untuk lanjut, 'n' untuk berhenti: ");
            choice = scanner.nextLine().toLowerCase().charAt(0);
            scanner.nextLine();
        } while (choice == 'y');

        System.out.println("Output: " + numbers);

        scanner.close();
        scanner = null;
    }

    public String swapCase(String str) {
        if(str == null) {
            throw new IllegalArgumentException("input is null");
        }

        String result = "";

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Practice04 practice04 = new Practice04();
        System.out.println("Create a program that prints a multiplication table up to n x n.");
        practice04.printMultiplicationTable(5);
        System.out.println("Write a program to print the following pattern for n rows");
        practice04.printStar(5);
        System.out.println("Write a code that reads n number of input from scanner");
        practice04.readNumber();
        System.out.println("Write a code to swap the case of each character from string");
        System.out.println(practice04.swapCase("The QuiCk BrOwN Fox"));
    }
}
