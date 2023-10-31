import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    /*
    Max값 만큼( 찾을 수들) 반복하고 안에서 deque 이동횟수 M만큼 for문 반복 N*M의 반복
    O(N*M)의 시간복잡도를 갖는다. 상한선 N(빅오) 하한선 1(오메가) -> 빅오(N)
    */
    public static void main(String[] args) {
        LinkedList<Integer> deque = new LinkedList<Integer>(); //deque 생성
        int count = 0; // 2,3번 연산 수행횟수
        try {
            StringTokenizer st = new StringTokenizer(br.readLine()," "); //st로 한줄씩 읽는다.
            int len = Integer.parseInt(st.nextToken()); //초기 배열 세팅
            int max = Integer.parseInt(st.nextToken()); // 찾을 횟수

            //deque에 값을 넣기
            for (int i = 1; i <= len; i++) {
                deque.offer(i);
            }

            int[] find = new int[max]; // max-1 배열 생성
            st = new StringTokenizer(br.readLine(), " "); // 2번째 줄에 찾을 값을 읽는다.
            for (int i = 0; i < max ; i++) {
                find[i] = Integer.parseInt(st.nextToken());
            }

            // deque의 횟수 구하는 메인 메소드
            for (int i = 0; i < max; i++) {
                int target_idx = deque.indexOf(find[i]); // 인덱스는 0부터 시작
                int position_half;
                if(deque.size() % 2 == 0){
                    position_half = deque.size()/2 - 1;
                } else{
                    position_half = deque.size()/2;
                }

                if(target_idx <= position_half) {
                    for(int j = 0; j < target_idx; j++) {
                        int temp = deque.pollFirst(); // deque의 0번째 인덱스의 값 추출
                        deque.offerLast(temp); // 반대쪽에 값을 붙인다.
                        count++; // 2번 연산이므로 +1
                    }
                }
                else {
                    for(int j = 0; j < deque.size() - target_idx; j++) {
                        int temp = deque.pollLast(); // 반대쪽 원소를 오른쪽으로 이동
                        deque.offerFirst(temp); // 붙이기
                        count++; // 3번 연산 +1
                    }
                }
                deque.pollFirst(); // 값 추출(
            }
            bw.write(String.valueOf(count));
            bw.flush();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}