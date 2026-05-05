
//Finding equilibrium index of an array
import java.util.*;

public class Array_17 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
        int equilibriumIndex = sol.findEquilibriumIndex(arr);
        if (equilibriumIndex != -1) {
            System.out.println("Equilibrium Index: " + equilibriumIndex);
        } else {
            System.out.println("No Equilibrium Index found.");
        }
    }
}

class Solution {
    public int findEquilibriumIndex(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        int left = 0, right = total;
        for (int i = 0; i < arr.length; i++) {
            right -= arr[i];
            if (left == right) {
                return i;
            }
            left += arr[i];
        }
        return -1;
    }
}