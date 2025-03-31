package ab_firstjava.lecture;

// All Primitives

import java.util.Scanner;

public class Question_04 {
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter your name : ");
            String name = sc.nextLine();
            System.out.println("Enter your roll number : ");
            int rollNo = sc.nextInt();
            System.out.println("Enter your marks : ");
            float marks = sc.nextFloat();
            System.out.println("Enter your section : ");
            char section = sc.next().charAt(0);
            System.out.println("Enter your height : ");
            byte height = sc.nextByte();
            System.out.println("Enter your total marks : ");
            short total_marks = sc.nextShort();
            System.out.println("Enter your percentage : ");
            double percentage = sc.nextDouble();
            System.out.println("Do you know english (true/false) : ");
            boolean check = sc.nextBoolean();
        
        System.out.println("Name : " + name);
        System.out.println("Roll No. : " + rollNo);
        System.out.println("Marks : " + marks);
        System.out.println("Section : " + section);
        System.out.println("Height : " + height);
        System.out.println("Total marks : " + total_marks);
        System.out.println("Percentage : " + percentage);
        System.out.println("Know English : " + check);
        }
    }
}
