package ab_firstjava.lecture;

public class Question_06 {
    public static void main(String[] args) {
        
        // Type conversion
        int num1 = 34;
        System.out.print(num1 + " -> ");
        float val1 = num1;
        System.out.println(val1);

        int numC = 'a';
        System.out.println(numC);

        // Type casting
        float num2 = 69f;
        System.out.print(num2 + " -> ");
        int val2 = (int)num2;
        System.out.println(val2);

        int a = 257;
        System.out.print(a + " -> ");
        byte b = (byte)a;
        System.out.println(b);
        
        // Automatic type promotion in expressioins
        byte x1 = 34;
        byte x2 = 69;
        byte x3 = 5;
        int ans1= x1 * x2 / x3;
        System.out.println(ans1);

        byte z1 = 40;
        z1 =(byte)(z1 + 2);
        System.out.println(z1);

        byte s1 = 42;
        char s2 = 'a';
        short s3 = 1024;
        int s4 = 50_000;
        float s5 = 5.67f;
        double s6 = 0.1234;
        double result = (s5 * s1)+(s4 / s2)-(s6 * s3);
        System.out.println((s5 * s1)+ " " +(s4 / s2)+ " " +(s6 * s3));
        System.out.println(result);
    }
}
