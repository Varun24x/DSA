package ab_firstjava.assignment;

//Input currency in rupees and output in USD.

import java.util.Scanner;

public class Question_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter currency in rupees :");
        double INR = sc.nextInt();
        double USD = INR/85.44;
        System.out.println("Value in USD is : " + USD);
    }
}
