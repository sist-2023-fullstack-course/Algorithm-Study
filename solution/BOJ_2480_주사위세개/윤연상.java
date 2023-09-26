import java.util.Arrays;
import java.util.Scanner;

public class 주사위세개 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int ans = 0;
        if (arr[0] == arr[2]) {
            ans = 10000 + arr[0] * 1000;
        } else if (arr[0] == arr[1] || arr[1] == arr[2]) {
            ans = 1000 + arr[1] * 100;
        } else {
            ans = arr[2] * 100;
        }

        System.out.println(ans);
    }
}
