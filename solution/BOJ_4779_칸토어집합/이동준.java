import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//칸토어
public class Main {
    static StringBuilder ans;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String condition;
        int nCondition;
        try {
            while((condition = br.readLine())!= null){
                nCondition = Integer.parseInt(condition);
                ans = new StringBuilder();
                int len = (int)Math.pow(3,nCondition);
                for (int i = 0; i < len; i++) {
                    ans.append("-");
                }
                algo(0,len);
                //System.out.println(ans);
                bw.write(String.valueOf(ans) +"\n" );
                bw.flush();

            }


        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void algo(int start, int size){
        if(size ==1){
            return;
        }
        int nSize = size / 3;
        for (int i = start + nSize; i < start + nSize*2; i++) {
            ans.setCharAt(i,' ');
        }
        algo(start,nSize);
        algo(start+nSize*2,nSize);
    }
}
