package aa_flowofprogram.assingment;

// Input a year and find whether it is a leap year or not.

import java.util.Scanner;

public class Question_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int year = sc.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("It is a Leap year");
        }else{
            System.out.println("It is not a Leap year");
        }
    }
    
}
