
//Find all non-repeating elements in an array
import java.util.*;

public class Array_15 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int arr[] = { 4, 2, 5, 4, 4, 3, 1, 5, 6 };
        int[] nonRepeatingElements = sol.findNonRepeatingElements(arr);
        System.out.println("Non-repeating elements in the array");
    }
}

class Solution {
    public int[] findNonRepeatingElements(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean isnonrepeating = true;
            if (i > 0 && arr[i] == arr[i - 1]) {
                isnonrepeating = false;
            }
            if (i < n - 1 && arr[i] == arr[i + 1]) {
                isnonrepeating = false;
            }
            if (isnonrepeating) {
                System.out.print(arr[i] + " ");
            }
        }
        return new int[0];
    }
}