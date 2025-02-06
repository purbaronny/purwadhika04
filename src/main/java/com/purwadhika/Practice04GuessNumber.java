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
        int kesempatan = 0;
        int tebakan = 0;

        System.out.println("Selamat datang di Tebak Angka!");
        System.out.println("Pilih angka antara 1 sampai " + max + ".");
        System.out.println("Coba tebak!");

        while (tebakan != randomNumber) {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = scanner.nextInt();
            scanner.nextLine();
            kesempatan++;

            if (tebakan < randomNumber) {
                System.out.println("Terlalu rendah! Coba lagi.");
            } else if (tebakan > randomNumber) {
                System.out.println("Terlalu tinggi! Coba lagi.");
            } else {
                System.out.println("Selamat! Anda menebak dengan benar.");
                System.out.println("Jumlah percobaan: " + kesempatan);
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
