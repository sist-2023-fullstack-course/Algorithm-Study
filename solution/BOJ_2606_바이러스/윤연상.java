import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    private static ArrayList<Integer>[] adjList = new ArrayList[101];
    private static boolean[] infected = new boolean[101];

    static{
        for(int i=0;i<adjList.length;i++){
            adjList[i] = new ArrayList<>();
        }
    }

    static void dfs(int cur){
        infected[cur] = true;

        for(int next : adjList[cur]){
            if(!infected[next]){
                dfs(next);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(in.readLine());
        int m = Integer.parseInt(in.readLine());
        for(int i=0;i<m;i++){
            StringTokenizer st = new StringTokenizer(in.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            adjList[a].add(b);
            adjList[b].add(a);
        }

        dfs(1);

        int cnt = 0;
        for(int i=2;i<=n;i++){
            if(infected[i]){
                cnt++;
            }
        }
        out.write(cnt + "");
        out.flush();
    }
}
