import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static boolean isPerfectNumber(int num) {
		int sum = 0;
		for(int i=1;i<num;i++) {
			if(num%i==0)
				sum+=i;
		}
		
		return sum == num;
	}
	
	public static void main(String[] args) throws Exception{
		while(true) {
			int num = Integer.parseInt(in.readLine());
			
			if(num == -1)
				break;
			
			if(isPerfectNumber(num)) {
				ArrayList<String> list = new ArrayList<String>();
				for(int i=1;i<num;i++)
					if(num%i==0)
						list.add(String.valueOf(i));
				
				out.write(num + " = " + String.join(" + ", list) + "\n");
			}
			else {
				out.write(num + " is NOT perfect." + "\n");
			}
		}
		out.flush();
	}
}
