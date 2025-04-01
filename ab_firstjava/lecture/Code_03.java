package ab_firstjava.lecture;

// Taking inputs and printing them.

import java.util.Scanner;

public class Code_03 {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter your name : ");
        try(Scanner sc = new Scanner(System.in)){
            System.out.println(sc.next());
            System.out.print("Enter your age : ");
            num = sc.nextInt();
            System.out.println(num);
        }
    }
}
