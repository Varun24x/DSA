package af_arrays.assignment;

// Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] 
// for each 0 <= i < nums.length and return it.
//A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

import java.util.Scanner;
import java.util.Arrays;

public class Question_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases : ");
        int test = sc.nextInt();
        for(int i = 0; i < test; i++){
            System.out.print("Enter the length of array : ");
            int n = sc.nextInt();
            System.out.print("Enter the array elements : ");
            int[] arr = new int[n];
            for(int j = 0 ; j < n; j++){
                arr[j] = sc.nextInt();
            }
            System.out.println(Arrays.toString(arr));
            String ans = Arrays.toString(buildArray(arr));
            System.out.println(ans);
        }
        
    }
    public static int[] buildArray(int[] nums){
        int[] ans =  new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
