package ac_conditionalsloops.lecture;

// Take input of threee numbers.
//  And find the largest of three numbers.

import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int max;
        System.out.println("Enter three numbers : ");
        try(Scanner sc = new Scanner(System.in)){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        }
        max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        System.out.println(max);

        // OR

        System.out.println(Math.max(Math.max(a,b),c));
    }
}
 