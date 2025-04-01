package ac_conditionalsloops.lecture;

// Fibonacci number

import java.util.Scanner;

public class Question_05 {
    public static void main(String[] args) {
        int fib0 = 0;
        int fib1 = 1;
        int lastI;
        int ans = 0;
        try(Scanner sc = new Scanner(System.in)){
            lastI = sc.nextInt();
        }
        if(lastI == 0 || lastI == 1){
            System.out.println(lastI);
            return;
        }
        for(int i = 2; i <= lastI; i++ ){
            ans = fib0 + fib1;
            fib0 = fib1;
            fib1 = ans;
        }
        
        System.out.println(ans);
    }
}
