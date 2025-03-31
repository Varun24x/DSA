package aa_flowofprogram.lecture;

// Take input of a salary.
// If the salary is greater than 10,000 add bonous of 2000,
// otherwise add bonus of 1000.

import java.util.Scanner;

public class Question_01{
    public static void main(String[] args) {
        int salary;
        int bonus;
        int pay; 
        System.out.print("Enter the Salary : ");
        try (Scanner sc = new Scanner(System.in)) {
            salary = sc.nextInt();
        }
        if(salary > 20000){
            bonus = 2000;
        }else{
            bonus = 1000;
        }
        pay = salary + bonus;
        System.out.println("Your pay is : " + pay);
    }
}