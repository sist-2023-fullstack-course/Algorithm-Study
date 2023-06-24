import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10810_공넣기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st=new StringTokenizer(in.readLine());
		
		int n=Integer.parseInt(st.nextToken());
		int[] arr=new int[n];
		int m=Integer.parseInt(st.nextToken());
		
		for(int i=0;i<m;i++) {
			st=new StringTokenizer(in.readLine());
			int start=Integer.parseInt(st.nextToken());
			int end=Integer.parseInt(st.nextToken());
			int ball=Integer.parseInt(st.nextToken());
			
			for(int j=start-1;j<end;j++) {
				arr[j]=ball;
			}
		}
		
		for(int k=0;k<arr.length;k++) {
			out.write(arr[k]+" ");
		}
		
		out.flush();
		out.close();
	}

}
