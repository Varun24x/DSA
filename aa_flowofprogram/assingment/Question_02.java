package aa_flowofprogram.assingment;

//Take two numbers and print the sum of both.

import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum is " + sum); 
    }   
}
