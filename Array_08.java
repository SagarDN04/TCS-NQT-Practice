
//Average of all the elements in the array 
import java.util.*;

public class Array_08 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr[] = { 3, 2, 4, 5, 6 };
        int avg = sol.avgarr(arr);
        System.out.println("Average of the elements of the array: " + avg);
    }
}

class Solution {
    public int avgarr(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
