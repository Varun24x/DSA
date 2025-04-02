package ab_firstjava.assignment;

// Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name ");
        System.out.println("Hello, "+ sc.next());
        
    }
}
