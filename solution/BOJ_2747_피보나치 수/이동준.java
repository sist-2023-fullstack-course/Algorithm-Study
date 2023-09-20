import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) {
        try {
            String s = br.readLine();
            int num = Integer.parseInt(s);
            int arr[] = new int[num + 1];
            for (int i = 0; i <= num; i++) {
                if (i == 0) {
                    arr[1] = 1;
                    i = 2;
                }
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            System.out.println(arr[num]);
            bw.flush();
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}