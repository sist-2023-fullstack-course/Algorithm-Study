import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 0일떄 가장큰 값이 나와야 하므로 MAX힙으로 설계하는게 편하다. 근데 입력되는 자연수가 조건이 그지같네... 하지만~2^31승은 21억이 안되죠?ㅎ
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] heap ;
    static int index = 1;

    public static void change(int low_val, int high_val){
        int temp = heap[low_val];
        heap[low_val] = heap[high_val];
        heap[high_val] = temp;
    }
    public static void push(int value){
        heap[index] = value;
        for (int i = index; i>1 ; i/=2) {
            if (heap[i]<heap[i/2]){
                change(i/2,i);
            }else
                break;
        }
        index++;
    }

    public static void pop(){
        try {
            if (index == 1){
                bw.write("0\n");
            }else {
                bw.write(heap[1]+"\n");
                heap[1] = heap[--index];

                // 출력 후 정렬
                for (int i = 1; i < index; ) {
                    if(i>index/2) {
                        break;
                    }
                    if(heap[i] < heap[i*2] && heap[i] < heap[i*2+1]) {
                        break;
                    }else if(heap[i*2] > heap[i*2+1]) {
                        change(i, i*2+1);
                        i = i*2+1;
                    } else {
                        change(i, i*2);
                        i*=2;
                    }
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        try {
            int cal = Integer.parseInt(br.readLine());
            heap = new int[cal];

            for (int i = 0; i < cal ; i++) {
                int val = Integer.parseInt(br.readLine());
                if(val == 0){
                    pop();
                }else {
                    push(val);
                }
            }
            bw.flush();

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}