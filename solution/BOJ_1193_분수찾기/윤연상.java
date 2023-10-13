import java.io.*;

public class Main {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int x = Integer.parseInt(in.readLine());

        int cur = 1;
        while(x > cur){
            x -= cur++;
        }

        if(cur % 2 == 0)
            out.write(x + "/" + (cur+1-x));
        else
            out.write((cur+1-x) + "/" + x);
        out.flush();
    }
}