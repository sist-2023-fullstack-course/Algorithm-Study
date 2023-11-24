import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(in.readLine());
		List<String> words = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			words.add(in.readLine());
		}

		Collections.sort(words, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length()) {
					return 1;
				} else if(o1.length() < o2.length()) {
					return -1;
				} else {
					return o1.compareTo(o2);
				}
			}
			
		});
		
		String prev = "";
		for(String word : words) {
			if(!prev.equals(word)) {
				out.write(word + "\n");
			}
			prev = word;
		}
		out.flush();
	}
}
