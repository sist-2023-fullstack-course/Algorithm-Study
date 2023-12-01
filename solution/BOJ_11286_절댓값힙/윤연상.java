import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(in.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1) == Math.abs(o2)){
                    return o1 - o2;
                }
                return Math.abs(o1) - Math.abs(o2);
            }
        });

        for(int i=0;i<n;i++){
            int num = Integer.parseInt(in.readLine());

            if(num == 0){
                if(!pq.isEmpty()){
                    out.write(pq.poll() + "\n");
                } else{
                    out.write(0 + "\n");
                }
            } else{
                pq.add(num);
            }
        }
        out.flush();
    }
}
