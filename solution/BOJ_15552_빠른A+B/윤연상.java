import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
			int tc = Integer.parseInt(in.readLine());
			for(int i=0;i<tc;i++) {
				String[] line = in.readLine().split(" ");
				int result = Integer.parseInt(line[0])+Integer.parseInt(line[1]);
				out.write(String.valueOf(result)+"\n");
			}
			out.flush();
			out.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
