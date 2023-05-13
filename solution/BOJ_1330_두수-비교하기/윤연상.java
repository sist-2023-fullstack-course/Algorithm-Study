import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String[] line = in.readLine().split(" ");
			
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			
			if(a > b)
				out.write(">");
			else if (a < b)
				out.write("<");
			else
				out.write("==");
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
