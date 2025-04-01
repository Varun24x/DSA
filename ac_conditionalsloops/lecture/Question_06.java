package ac_conditionalsloops.lecture;

// Counting occurrences

import java.util.Scanner;

public class Question_06 {
    public static void main(String[] args) {
        int count = 0 ;
        int num;
        int target;
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number and the target : ");
            num = sc.nextInt();
            target = sc.nextInt();
        }
        while(num > 0){
            int rem = num % 10;
            num /= 10;
            if(rem == target){
                count++;
            }
        }
        System.out.println(count);
    }
}
