import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer st;

    static double solve() throws IOException{
        int n = Integer.parseInt(in.readLine());
        st = new StringTokenizer(in.readLine(), " ");
        
        double[] score = new double[n];
        double max = 0.0;
            
        for(int i=0;i<n;i++){
            score[i]=Double.parseDouble(st.nextToken());
            max = Math.max(score[i], max);
        }
            
        double sum = 0.0;
        for(int i=0;i<n;i++){
            sum += (score[i]/max)*100;
        }
        
        return sum/n;
    }
    
    public static void main(String[] args) throws IOException{
        out.write(String.valueOf(solve()));
        out.flush();
    }
}