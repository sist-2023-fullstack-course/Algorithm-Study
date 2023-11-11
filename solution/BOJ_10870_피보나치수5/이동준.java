import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 피보나치
public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            String length = br.readLine();
            int ilen = Integer.parseInt(length);
            if (ilen == 0){
                bw.write(Integer.toString(ilen));
            }
            else {
                int[] arr = new int[ilen + 1];
                for (int i = 0; i < arr.length; i++) {
                    if (i == 0) {
                        arr[i] = 0;
                        arr[i + 1] = 1;
                        i++;
                        continue;
                    }
                    arr[i] = arr[i - 1] + arr[i - 2];
                }
                bw.write(Integer.toString(arr[arr.length-1]));
            }
            bw.flush();

        } catch (Exception e){
            e.printStackTrace();
        }
    }

}