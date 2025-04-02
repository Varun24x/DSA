package ab_firstjava.assignment;

//To find Armstrong Number between two given number.

import java.util.Scanner;

public class Question_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check armstrong : ");
        int num = sc.nextInt();
        int digit = (int)Math.log10(num) + 1;
        int numCheck = num;
        int arms = 0;
        while(numCheck > 0){
            int rem = numCheck % 10;
            arms += (int)Math.pow(rem,digit);
            numCheck /= 10;
        } 
        if(arms == num){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not a Armstrong number");
        }
    }
}
