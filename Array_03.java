//Second Smallest and Second Largest element in an array

import java.util.*;

public class Array_03 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr[] = { 4, 5, 6, 2, 3, 1 };
        int ans[] = sol.finsecminmax(arr);
        System.out.println("Second Smallest: " + ans[0]);
        System.out.println("Second Largest: " + ans[1]);
    }
}

class Solution {
    public int[] finsecminmax(int arr[]) {
        if (arr == null || arr.length < 2) {
            return new int[] { -1, -1 };
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int secmin = Integer.MAX_VALUE;
        int secmax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // --- Second Smallest Logic ---
            if (arr[i] < min) {
                secmin = min;
                min = arr[i];
            } else if (arr[i] > min && arr[i] < secmin) {
                secmin = arr[i];
            }
            // --- Second Largest Logic ---
            if (arr[i] > max) {
                secmax = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > secmax) {
                secmax = max;
            }
        }
        return new int[] { secmin, secmax };
    }
}
