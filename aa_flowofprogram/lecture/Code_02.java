package aa_flowofprogram.lecture;

// Input a number.
// And print wheater it is prime or not; 

import java.util.Scanner;

public class Code_02 {
    public static void main(String[] args) {
        int num;
        boolean flag = true;
        System.out.print("Enter the number to check prime : ");
        try (Scanner sc = new Scanner(System.in)) {
            num = sc.nextInt();
        }
        for (int i = 2; i < num; i++){
            if(num % i == 0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " is not a prime number");
        }
    }
}
