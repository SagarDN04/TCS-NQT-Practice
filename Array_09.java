
//Find the median of the given array
import java.util.*;

public class Array_09 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr[] = { 3, 2, 4, 5, 6, 9 };
        double median = sol.median(arr);
        System.out.println("Median of the elements of the array: " + median);
    }
}

class Solution {
    public double median(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        if (n % 2 != 0) {
            return arr[n / 2];
        } else {
            return (arr[n / 2] + arr[n / 2 - 1]) / 2.0;
        }
    }
}