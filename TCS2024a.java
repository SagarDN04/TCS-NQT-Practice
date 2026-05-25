import java.util.*;

public class TCS2024a {
    public int solution(int light, int air, int led) {
        int total = (light * 2) + (air * 10) + (led * 1);
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TCS2024a obj = new TCS2024a();
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            int[][] arr = new int[t][3];
            for (int i = 0; i < t; i++) {
                for (int j = 0; j < 3; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < t; i++) {
                int light = arr[i][0];
                int air = arr[i][1];
                int led = arr[i][2];
                int totalWattage = obj.solution(light, air, led);
                System.out.println(totalWattage);
            }
        }
    }
}
