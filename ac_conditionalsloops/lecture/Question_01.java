package ac_conditionalsloops.lecture;

public class Question_01 {
    public static void main(String[] args) {
        
        // If-else statement
        int salary = 45000;
        if(salary > 30000){
            salary += 5000;
        }else{
            salary += 2000;
        }
        System.out.println(salary);

        // If-else-if statement
        salary = 45000;
        if(salary > 50000){
            salary += 5000;
        }else if(salary > 30000){
            salary += 3000;
        }else{
            salary += 1000;
        }
        System.out.println(salary);
    }
}
