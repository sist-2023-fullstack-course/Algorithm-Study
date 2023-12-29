import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 0일떄 가장큰 값이 나와야 하므로 MAX힙으로 설계하는게 편하다. 근데 입력되는 자연수가 조건이 그지같네... 하지만~2^31승은 21억이 안되죠?ㅎ
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        StringTokenizer st;
        try {
            int arr = Integer.parseInt(br.readLine());
            PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 0; i < arr; i++) {
                st = new StringTokenizer(br.readLine()," ");

                for (int j = 0; j < arr; j++) {
                    q.offer(Integer.valueOf(st.nextToken()));
                }
            }
            for (int i = 0; i < arr-1; i++) {
                q.poll();
            }
            System.out.println(q.poll());

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}

