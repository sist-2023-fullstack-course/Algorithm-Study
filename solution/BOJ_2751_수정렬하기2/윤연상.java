import java.io.*;
import java.util.Arrays;

public class Main {
	private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	

	
	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(in.readLine());
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(in.readLine());
		}
		
		Arrays.sort(arr);
		
		for(int num : arr) {
			out.write(num + "\n");
		}
		out.flush();
	}
}
