import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = in.readLine();
		String[] line = str.split(" ");
		
		int n = Integer.parseInt(line[0]); 
		int m = Integer.parseInt(line[1]);
		
		str = in.readLine();
		line = str.split(" ");
		
		int[] cards = new int[n];
		for(int i=0;i<n;i++) {
			cards[i] = Integer.parseInt(line[i]);
		}
		
		int max = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				for(int k = j + 1; k < n; k++) {
					int sum = cards[i]+cards[j]+cards[k];
					
					if(sum <= m) {
						max = max > sum ? max : sum;
					}
				}
			}
		}
		
		out.write(String.valueOf(max));
		out.flush();
	}
}
