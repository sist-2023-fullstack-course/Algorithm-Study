import java.io.*;

public class Main {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String input = in.readLine();
        int[] hash = new int[26];

        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(c >= 'A' && c <= 'Z')
                hash[c - 'A']++;
            else
                hash[c - 'a']++;
        }

        int cnt=0;
        int ans=0;
        boolean isDup = false;
        for(int i=0;i<26;i++){
            if(hash[i] > cnt){
                isDup = false;
                cnt = hash[i];
                ans = i;
            }
            else if(hash[i] == cnt && hash[i] > 0){
                isDup = true;
            }
        }

        out.write(isDup ? '?' : ans + 'A');
        out.flush();
        out.close();
    }
}