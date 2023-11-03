import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node{
    int val;
    Node prev, next;

    Node(int val){
        this.val = val;
    }
}

public class Main {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    static Node getRotateLinkedList(int size){
        Node first = new Node(1);
        Node prev = first;
        for(int i=2;i<=size;i++){
            Node cur = new Node(i);
            cur.prev = prev;
            prev.next = cur;
            prev = cur;
        }
        first.prev = prev;
        prev.next = first;
        return first;
    }

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(in.readLine());

        Node cur = getRotateLinkedList(n);

        int ans = 0;
        for(int i=0;i<m;i++){
            int val = Integer.parseInt(st.nextToken());
            int cnt = 0;
            while(true){
                if(cur.val == val)
                    break;
                cur = cur.next;
                cnt++;
            }

            ans += Math.min(cnt, n - cnt);
            n--;

            cur.prev.next = cur.next;
            cur.next.prev = cur.prev;
            cur = cur.next;
        }

        out.write(String.valueOf(ans));
        out.flush();
    }
}