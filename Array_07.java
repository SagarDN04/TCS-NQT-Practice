
//Calculate sum of the elements of the array
import java.util.*;

public class Array_07 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr[] = { 1, 2, 3, 4, 5 };
        int sum = sol.arrelementsum(arr);
        System.out.println("Sum of the elements of the array: " + sum);
    }
}

class Solution {
    public int arrelementsum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}

// sum of digits
/*
 * class Solution {
 * public int getSumOfDigits(int n) {
 * int sum = 0;
 * 
 * // We use a while loop because we don't know if it's 3 or 4 digits
 * while (n > 0) {
 * // 1. Extract the last digit
 * int lastDigit = n % 10;
 * 
 * // 2. Add it to the total
 * sum += lastDigit;
 * 
 * // 3. Chop off the last digit
 * n = n / 10;
 * }
 * 
 * return sum;
 * }
 * }
 */