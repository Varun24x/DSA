package ab_firstjava.assignment;

// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Question_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fib0 = 0;
        int fib1 = 1;
        System.out.println("Enter the index upto which fibonacci is to printed : ");
        int n = sc.nextInt();
        System.out.println("Your series is : ");
        if(n < 0){
            return;
        }else if(n >= 0){
            if(n == 0){
                System.out.println(fib0);
            }else if(n == 1){
                System.out.println(fib0 + " " + fib1);
            }else{
                System.out.print(fib0 + " " + fib1 + " ");
                for(int i = 2 ; i <= n ; i++){
                    int nex = fib0 + fib1;
                    System.out.print(nex+ " ");
                    fib0 = fib1;
                    fib1 = nex;
                }
            }
        }
    }
}
