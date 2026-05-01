
//Remove duplicates from a sorted array
import java.util.*;

public class Array_10 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr[] = { 1, 2, 2, 3, 4, 4, 5 };
        int newLength = sol.removeDuplicates(arr);
        System.out.println("Length of the array after removing duplicates: " + newLength);
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

class Solution {
    public int removeDuplicates(int arr[]) {
        int n = arr.length;
        if (n == 0 || n == 1) {
            return n;
        }
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != arr[k]) {
                k++;
                arr[k] = arr[i];
            }
        }
        return k + 1;
    }
}