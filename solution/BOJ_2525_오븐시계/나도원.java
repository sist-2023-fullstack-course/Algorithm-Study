package week8_230926;

import java.io.*;
import java.util.StringTokenizer;
/*
    첫번째 오류 : M+COOK이 60분 이상이면 무조건 H+1만 함 => / 와 % 사용
    두번째 오류 : H가 23을 넘으면 무조건 0으로 함 => H-24
 */
public class BOJ_2525_오븐시계 {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st=new StringTokenizer(in.readLine());
        int H=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        int COOK=Integer.parseInt(in.readLine());

        if(M+COOK>=60)
        {
            H=H+((M+COOK)/60);
            M=(M+COOK)%60;
            if(H>23)
                H=H-24;
            out.write(String.valueOf(H+" "+M));
        }
        else
        {
            out.write(String.valueOf(H+" "+(M+COOK)));
        }

//        int m=(M+COOK) % 60;
//        int h=(H+(M+COOK)/60) % 24;
//        out.write(String.valueOf(h+" "+m));

        out.flush();
        out.close();
    }
}
