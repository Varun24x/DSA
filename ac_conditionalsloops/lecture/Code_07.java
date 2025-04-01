package ac_conditionalsloops.lecture;

// Reverse of a number

import java.util.Scanner;

public class Code_07 {
    public static void main(String[] args) {
        int num;
        int rev = 0;
        System.out.print("Enter the number : ");
        try(Scanner sc = new Scanner(System.in)){
            num = sc.nextInt();
        }
        while(num > 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num/=10;
        }
        System.out.println("Number in reversed form is : " + rev);
    }
}
