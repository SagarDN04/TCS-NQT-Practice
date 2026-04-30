
//Count frequency of each element in an array
import java.util.*;
import java.util.Arrays;

public class Array_05 {
    public static void main(String[] agrs) {
        Solution sol = new Solution();
        int arr[] = { 1, 2, 3, 2, 1, 4, 5 };
        sol.frequency(arr);
    }
}

class Solution {

    public int[] frequency(int arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }
            System.out.println(arr[i] + "-> " + count);
        }
        return arr;
    }
}
