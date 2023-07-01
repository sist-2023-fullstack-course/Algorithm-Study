import java.io.*;
public class 윤지수 {

    static boolean isPalindrome(String word)
    {
        int left=0;
        int right=word.length()-1;
        
        while(left<right)
        {
            if(word.charAt(left)!=word.charAt(right))
                return false;
            
            left++;
            right--;
        }
        
        return true;
    }
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		
        String word=in.readLine();
        
        if(isPalindrome(word))
            System.out.println(1);
        else
            System.out.println(0);
        
        out.flush();
        out.close();
    }
    
    
}
