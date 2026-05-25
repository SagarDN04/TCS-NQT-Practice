
//in one hub there is a car and bike car contain 4 wheels and bike contain 2 wheels find total number of wheels in the hub
/*input:
3
4 2
2 1
0 1

Output:
20
10
2

*/
import java.util.*;

public class TCS2024 {
    public int solution(int bike, int car) {
        int total = (bike * 2) + (car * 4);
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TCS2024 obj = new TCS2024();
        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            int[][] arr = new int[t][2];
            for (int i = 0; i < t; i++) {
                for (int j = 0; j < 2; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < t; i++) {
                int car = arr[i][0];
                int bike = arr[i][1];
                int totalWheels = obj.solution(bike, car);
                System.out.println(totalWheels);
            }
        }
    }
}
