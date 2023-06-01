package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 블랙잭_2798 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//첫번쨰줄 저장
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		//카드갯수
		int N=Integer.parseInt(st.nextToken());
		//카드의 합 기준
		int M=Integer.parseInt(st.nextToken());
		
		//두번쨰줄 저장
		st=new StringTokenizer(br.readLine());
		
		//N개의 카드 초기화
		int arr[]=new int[N];
		
		//두번째줄 카드값 저장
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		// 최대합 초기화 
		int maxSum=0;
		
		
		//3카드의 합이 M을 넘지 않는 최댓값 구하기
		for(int i=0;i<N-2;i++)
		{
			for(int j=i+1;j<N-1;j++)
			{
				for(int k=j+1;k<N;k++)
				{
					int sum=arr[i]+arr[j]+arr[k];
					if(sum<M && sum>maxSum)
					{
						maxSum=sum;
					}
					
						
				}
			}
		}
		System.out.println(maxSum);
	}
}
