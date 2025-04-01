package ab_firstjava.lecture;

public class Code_07 {
    public static void main(String[] args) {
        // If Statement 
        int a = 5;
        if(a == 5){
            System.out.println("Win");
        }

        // While loop
        int count  = 1;
        while(count != 6){
            System.out.print(count + " ");
            count++;
        }
        System.out.println();

        // For loop
        for(int i = 6 ; i <= 10 ; i++){
            System.out.print(i + " ");
        }
    }
}
