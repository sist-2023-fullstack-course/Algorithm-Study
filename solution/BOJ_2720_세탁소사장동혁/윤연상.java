import java.io.*;
import java.util.Scanner;

public class Main {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(in.readLine());

        for(int i=0;i<t;i++){
            int n = Integer.parseInt(in.readLine());

            out.write(n / 25 + " ");
            n %= 25;
            out.write(n / 10 + " ");
            n %= 10;
            out.write(n / 5 + " ");
            n %= 5;
            out.write(n + "\n");
        }

        out.flush();
    }
}