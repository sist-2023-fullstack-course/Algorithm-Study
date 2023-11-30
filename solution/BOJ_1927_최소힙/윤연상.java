import java.io.*;

class Heap{
    private int size = 0;
    private int[] data;

    Heap(int size){
        data = new int[size + 1];
    }

    private void swap(int a, int b){
        int tmp = data[a];
        data[a] = data[b];
        data[b] = tmp;
    }

    void push(int num){
        data[++size] = num;

        int cur = size;
        while(cur > 1){
            int parent = cur / 2;

            if(data[parent] > data[cur]) {
                swap(parent, cur);
                cur = parent;
            } else {
                break;
            }
        }
    }

    int pop(){
        if(size == 0) return 0;

        int ret = data[1];
        swap(1, size--);

        int cur = 1;
        while(cur * 2 <= size){
            int child = cur * 2;
            if(cur * 2 + 1 <= size && data[cur * 2] > data[cur * 2 + 1]){
                child = cur * 2 + 1;
            }

            if(data[child] < data[cur]){
                swap(child, cur);
                cur = child;
            } else {
                break;
            }
        }

        return ret;
    }
}

public class Main {
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(in.readLine());
        Heap heap = new Heap(n);

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(in.readLine());
            if(num == 0){
                out.write(heap.pop() + "\n");
            } else {
                heap.push(num);
            }
        }
        out.flush();
    }
}
