package ab_firstjava.assignment;

// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Question_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String to check palindrome : ");
        String word = sc.next();
        boolean check = true;
        int i = 0;
        int j = word.length()-1;
        while(i < j){
            if(word.charAt(i) != word.charAt(j)){
                check = false;
                break;
            }
            i++;
            j--;
        }
        if(check){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
