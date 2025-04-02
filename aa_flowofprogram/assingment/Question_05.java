package aa_flowofprogram.assingment;

// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

public class Question_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            String val = sc.next();
            if(val.equals("X")|| val.equals("x")){
                break;
            }
            sum = sum + Integer.parseInt(val);
        }
        System.out.println(sum);
    }
}
