package ab_firstjava.assignment;

// Take in two numbers and an operator (+, -, *, /) and calculate the value.
// (Use if conditions)

import java.util.Scanner;

public class Question_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter operation to be performed : ");
        char op = sc.next().trim().charAt(0);
        if(op == '+'){
            System.out.println("Addition is : " + (num1 + num2));
        }else if(op == '-'){
            System.out.println("Subtraction is : " + (num1 - num2));
        }else if(op == '*'){
            System.out.println("Multiplication is : " + (num1 * num2));
        }else if(op == '/'){
            System.out.println("Division is : " + (num1 / num2));
        }else if(op == '%'){
            System.out.println("Remainder is : " + (num1 % num2));
        }else{
            System.out.println("Invalid operation!");
        }
    }
}
