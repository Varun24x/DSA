package ab_firstjava.lecture;

// Sum two numbers

import java.util.Scanner;

public class Code_05 {
    public static void main(String[] args) {
        int a;
        int b;
        int sum;
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter two numbers for addition :");
            a = sc.nextInt();
            b = sc.nextInt();
        }
        sum = a + b;
        System.out.println(sum);
    }
    
}
