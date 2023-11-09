import java.io.*;
import java.util.Arrays;

public class Main {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    private static char[] Cantor;

    static void makeCantorSet(int s, int e){
        if(s >= e){
            return;
        }

        int len = e + 1 - s;
        int cs = s + len / 3;
        int ce = s + len * 2 / 3;

        for(int i=cs;i<ce;i++){
            Cantor[i]=' ';
        }
        makeCantorSet(s, cs-1);
        makeCantorSet(ce, e);
    }
    
    public static void main(String[] args) throws IOException {
        String line;
        while((line = in.readLine()) != null){
            int n = Integer.parseInt(line);
            Cantor = new char[(int)Math.pow(3, n)];
            Arrays.fill(Cantor, '-');

            makeCantorSet(0, Cantor.length-1);

            for(int i=0;i<Cantor.length;i++){
                out.write(Cantor[i]);
            }
            out.write('\n');
        }
        out.flush();
    }
}