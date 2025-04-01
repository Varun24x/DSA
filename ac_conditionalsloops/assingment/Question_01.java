package ac_conditionalsloops.assingment;

// # leetcode 1281
// Given an integer number n, return the difference between the product of its digits and the sum of its digits.

import java.util.Scanner;

public class Question_01 {
    public static void main(String[] args) {
        int num;
        int test;
        Scanner sc = new Scanner(System.in);
        test = sc.nextInt();
        for(int i = 0;i < test; i++){
            num = sc.nextInt();
            int ans = subtractProductAndSum(num);
            System.out.print(ans + " ");
        }
        sc.close();
    }    
    public static int subtractProductAndSum(int n){
        int sum = 0;
        int product = 1;
        int ans;
        while(n>0){
            int rem = n % 10;
            sum += rem;
            product *= rem;
            n /= 10; 
        }
        ans = product - sum;
        return ans;
    }
}
