package com.purwadhika;

public class Practice04 {

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

        // TODO start
        // TODO end
    }

    public static void main(String[] args) {
        Practice04 practice04 = new Practice04();
        System.out.println("Create a program that prints a multiplication table up to n x n.");
        practice04.printMultiplicationTable(5);
    }
}
