package aa_flowofprogram.assingment;

//Take 2 numbers as inputs and find their HCF and LCM.

import java.util.Scanner;

public class Question_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int HCF;
        int LCM;
        int rem;
        while((a % b) != 0){
            rem = a % b;
            a = b;
            b = rem;
        }
        HCF = b;
        LCM = (a * b) / HCF;
        System.out.println("LCM is : " + LCM);
        System.out.println("HCF is : " + HCF);
    }
}
