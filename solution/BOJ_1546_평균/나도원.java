import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1546_평균 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(in.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(in.readLine());
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		int max=0;
		int sum=0;
		double avg=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
			sum+=arr[i];
			avg=sum/max*100;
		}
		out.write(String.valueOf(avg));
		
		out.flush();
		out.close();
	}

}
