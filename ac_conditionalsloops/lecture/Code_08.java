package ac_conditionalsloops.lecture;

// Calculator and exit when user enter x or X

import java.util.Scanner;

public class Code_08 {
    public static void main(String[] args) {
        int symbol;
        int num1;
        int num2;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Symbol : ");
            symbol = sc.next().trim().charAt(0);
            if(symbol == 'x' || symbol == 'X'){
                System.out.println("Exit performed!");
                break;
            }
            System.out.println("Enter two numbers : ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            if(symbol == '+'){
                System.out.println(num1 + num2);
            }else if(symbol == '*'){
                System.out.println(num1 * num2);
            }else if(symbol == '/'){
                System.out.println(num1 / num2);
            }else if(symbol == '%'){
                System.out.println(num1 % num2);
            }else if(symbol == '-'){
                System.out.println(num1 - num2);
            }else{
                System.out.println("Invalid operation!");
            }
        }
    }
}




