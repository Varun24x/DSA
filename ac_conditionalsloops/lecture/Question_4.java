package ac_conditionalsloops.lecture;

// ALphabet case check

import java.util.Scanner;
public class Question_4 {
    public static void main(String[] args) {
        int alpha;
        try(Scanner sc = new Scanner(System.in)){
            alpha = sc.next().trim().charAt(0);
        }
        if(alpha >= 97 && alpha <= 122){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
