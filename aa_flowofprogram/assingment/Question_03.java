package aa_flowofprogram.assingment;

// Take a number as input and print the multiplication table for it.

import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }    
}
