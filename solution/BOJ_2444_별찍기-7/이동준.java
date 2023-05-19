import java.io.*;
public class Main {
	public static void main(String[] args) {
		
		BufferedReader br;
		try 
		{
			br= new BufferedReader(new InputStreamReader(System.in));
			int N=Integer.parseInt(br.readLine());
			for(int i=1; i<=N;i++) {
				for(int j=N-i;j>=1;j--) {
					System.out.print(" ");
				}
				for(int x=1; x<=2*i-1; x++) {
					System.out.print("*");
				}
				System.out.println();
			}
			for(int i=N-1; i>=1; i--) {
				for(int j=1;j<=N-i; j++) {
					System.out.print(" ");
				}
				for(int x=1;x<=2*i-1;x++) {
					System.out.print("*");
				}
				System.out.println(); 
			}
		}catch(Exception ex) { 
			ex.printStackTrace(); 
		}
	}
} 
