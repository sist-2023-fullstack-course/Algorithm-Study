import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 윤연상
{
    public static boolean isPalindrome(String str){
        int len = str.length();

        for(int i=0;i<len/2;i++){
            if(str.charAt(i)!=str.charAt(len-i-1))
                return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        if(isPalindrome(in.readLine()))
            out.write("1");
        else
            out.write("0");

        out.flush();
        out.close();
    }
}