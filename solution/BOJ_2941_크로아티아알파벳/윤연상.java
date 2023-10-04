import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = in.readLine();

        int cnt = 0;
        char prev = '0';
        char prev2 = '0';

        for(int i=0;i<input.length();i++){
            char cur = input.charAt(i);

            if(prev2 == 'd' && prev == 'z' && cur == '='){
                cnt -= 2;
            }
            else if((prev == 'c' && cur == '=')
                    || (prev == 'c' && cur == '-')
                    || (prev == 'd' && cur == '-')
                    || (prev == 'l' && cur == 'j')
                    || (prev == 'n' && cur == 'j')
                    || (prev == 's' && cur == '=')
                    || (prev == 'z' && cur == '=')
            ){
                cnt--;
            }

            prev2 = prev;
            prev = cur;
            cnt++;
        }

        out.write(String.valueOf(cnt));
        out.flush();
    }
}