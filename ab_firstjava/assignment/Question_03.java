package ab_firstjava.assignment;

// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount, time , rate :  ");
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        int SI;
        SI = (p * r * t) / 100;
        System.out.println(SI);

    }
}
