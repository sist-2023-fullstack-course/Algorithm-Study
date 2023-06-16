import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * 3초! == 3억번 계산 가능
 
 N부터 M까지의 수들을 종이에 적었을 때 종이에 적힌 0들을 세는 프로그램을 작성하라.

예를 들어, N, M이 각각 0, 10일 때 0을 세면 0에 하나, 10에 하나가 있으므로 답은 2이다.

입력
첫 번째 줄에 테스트 케이스의 수 T가 주어진다.

각 줄에는 N과 M이 주어진다.

1 ≤ T ≤ 20
0 ≤ N ≤ M ≤ 1,000,000

T줄만큼 readline
한줄에 모든 숫자를 String으로 분리해서 ==0인 갯수를 체크

시간복잡도
Tx
0~백만개 = 한줄 + 각자리수마다 0과 비교
String s;
int cnt;
for(int i=0;i<s.length();i++)
{
	if(s.chatAt(i)==0)
		cnt++;
}
 */
public class Main{ 
	
	public static int countZero (int n , int m)
	{
		int cnt=0;
		for(int i=n;i<=m;i++)
		{
			String s=String.valueOf(i);
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(j)=='0')
					cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args)throws IOException {
		int n = 0,m=0;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		// 첫번째줄의 수는 T 1개
		int t=Integer.parseInt(br.readLine());
		// 두번째줄 부터 한줄씩 가져오기(~T번까지)
		for(int i=1;i<=t;i++)
		{
			StringTokenizer st=new StringTokenizer(br.readLine());
			n=Integer.parseInt(st.nextToken());
			m=Integer.parseInt(st.nextToken());
			
			System.out.println(countZero(n,m));
		}
	}
}
