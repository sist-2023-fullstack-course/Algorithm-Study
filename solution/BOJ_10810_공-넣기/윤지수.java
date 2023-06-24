import java.io.*;
import java.util.*;

/*첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
둘째 줄부터 M개의 줄에 걸쳐서 공을 넣는 방법이 주어진다. 
각 방법은 세 정수 i j k로 이루어져 있으며, 
i번 바구니부터 j번 바구니까지에 k번 번호가 적혀져 있는 공을 넣는다는 뜻이다.
 예를 들어, 2 5 6은 2번 바구니부터 5번 바구니까지에 6번 공을 넣는다는 뜻이다. 
 (1 ≤ i ≤ j ≤ N, 1 ≤ k ≤ N)
	*/
public class 윤지수 {
	
	static StringTokenizer st;
	static int N,M;
	static int[] baskets=new int[N+1];
	static void SetNumbers(int start,int end,int ballNumber)
	{
		for(int i=start;i<=end;i++)
		{
			baskets[i]=ballNumber;
		}
	}
	static void printNumbers()
	{
		for(int i=1;i<=N;i++)
		{
			if(i<N)
				System.out.print(baskets[i]+" ");
			else
				System.out.println(baskets[i]);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 첫째줄에 정수 2개> N:바구니 갯수 M:번 수행
		st=new StringTokenizer(in.readLine());
		N=Integer.parseInt(st.nextToken());
		M=Integer.parseInt(st.nextToken());
		
		for(int i=0;i<M;i++)
		{
			st=new StringTokenizer(in.readLine());
			int start=Integer.parseInt(st.nextToken());
			int end=Integer.parseInt(st.nextToken());
			int ballNumber=Integer.parseInt(st.nextToken());
			
			SetNumbers(start,end,ballNumber);
		}
		
		printNumbers();
		out.flush();
	}
}
