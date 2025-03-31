package ab_firstjava.lecture;

import java.util.Scanner;

public class Question_08 {
    public static void main(String[] args) {
        float celcius;
        float fahrenheit;
        System.out.print("Enter value in Celcius : ");
        try(Scanner sc = new Scanner(System.in)){
            celcius = sc.nextFloat();
        }
        fahrenheit = (celcius * 9/5) + 32;
        System.out.print("Value in Fahrenheit is : " + fahrenheit);
    }
}
