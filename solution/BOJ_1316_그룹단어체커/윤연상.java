import java.io.*;

public class Main {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    static boolean isGroupWord(String word){
        boolean[] used = new boolean[26];

        char prev = '0';
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);

            if(used[c - 'a'] && prev != c)
                return false;

            used[c - 'a'] = true;
            prev = c;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(in.readLine());

        int cnt = 0;
        for(int i=0;i<n;i++){
            if(isGroupWord(in.readLine())){
                cnt++;
            }
        }
        out.write(String.valueOf(cnt));
        out.flush();
    }
}