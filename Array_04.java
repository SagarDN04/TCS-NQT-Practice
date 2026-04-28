//Reverse a given array

import java.util.*;

public class Array_04 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr[] = { 1, 2, 3, 4, 5 };
        int rev[] = sol.reverse(arr);
        for (int i : rev) {
            System.out.print(i + " ");
        }
    }
}

class Solution {
    public int[] reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
}