package com.Rizal_Fahmi_Yofiawan.Projek;

import java.util.Scanner;

public class tebakan_angka {
    public static void main(String[] args) {
        System.out.println("SELAMAT DATANG DI MINIGAMES SAYA!");

        int secretNumber = (int) (Math.random() * 100) + 1;
        int guess = 0;
        int numGuesses = 0;

        Scanner input = new Scanner(System.in);

        while (guess != secretNumber) {
            System.out.print("TEBAK SARI ANGKA DARI 1 SAMPAI 100: ");
            guess = input.nextInt();
            numGuesses++;

            if (guess < secretNumber) {
                System.out.println("pelit amat nebak angkanya");
            } else if (guess > secretNumber) {
                System.out.println("ini malah kebanyakan");
            } else {
                System.out.println("Selamat akhirnya bisa nebak juga angkaku adalah :" + numGuesses );
            }
        }

        input.close();
    }
}
