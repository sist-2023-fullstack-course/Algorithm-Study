package week8_230926;

import java.io.*;
import java.util.StringTokenizer;

/*
1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.

같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다.
또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다.
3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.

3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
 */
public class BOJ_2480_주사위세개 {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st=new StringTokenizer(in.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        int c=Integer.parseInt(st.nextToken());

        // a,b,c가 다 다른 경우
        if(a!=b && b!=c && a!=c)
        {
            int max = 0;
            if(a>b)
            {
                if(c>a)
                    max=c;
                else
                    max=a;
            }
            if(b>a)
            {
                if(c>b)
                    max=c;
                else
                    max=b;
            }
            out.write(String.valueOf(max*100));
        }

        // 하나이상 같은 경우
        else
        {
            // a=b=c 다 같은 경우
            if(a==b && b==c)
            {
                out.write(String.valueOf(10000+(a*1000)));
            }

            // a,b,c 중 두 개가 같은 경우
            else
            {
                if(a==b || a==c)
                {
                    out.write(String.valueOf(1000+(a*100)));
                }
                else
                {
                    out.write(String.valueOf(1000+(b*100)));
                }
            }
        }

        out.flush();
        out.close();
    }
}
