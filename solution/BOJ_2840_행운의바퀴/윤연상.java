import java.io.*;
import java.util.*;

public class Main {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int ptr = 0;
        boolean valid = true;
        String[] wheel = new String[n];
        for(int i=0;i<k;i++){
            st = new StringTokenizer(in.readLine());
            int s = Integer.parseInt(st.nextToken());
            String alpa = st.nextToken();

            ptr = (ptr + 1000*n - s) % n;
            if(wheel[ptr] != null && !wheel[ptr].equals(alpa)){
                valid = false;
                break;
            }

            wheel[ptr] = alpa;
        }

        Set<String> used = new HashSet<>();
        for(String w : wheel){
            if(used.contains(w)){
                valid = false;
                break;
            }
            if(w != null)
                used.add(w);
        }

        if(valid){
            for(int i=ptr;i<ptr+n;i++){
                out.write(wheel[i%n] == null ? "?" : wheel[i%n]);
            }
        }
        else{
            out.write("!");
        }
        out.flush();
    }
}
