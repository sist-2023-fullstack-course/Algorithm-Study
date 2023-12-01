import java.io.*;

class Heap{
	private int size;
	private int[] data;
	
	Heap(){
		this(100000);
	}
	Heap(int maxSize){
		size = 0;
		data = new int[maxSize + 1];
	}
	
	private void swap(int a, int b) {
		int tmp = data[a];
		data[a] = data[b];
		data[b] = tmp;
	}
	
	int pop() {
		if(size == 0) return 0;
		
		int ret = data[1];
		swap(1, size--);
		
		int cur = 1;
		while(cur * 2 <= size) {
			int child;
			if(cur * 2 + 1 <= size) {
				child = (data[cur * 2] >= data[cur * 2 + 1]) ? cur * 2 : cur * 2 + 1;
			} else {
				child = cur * 2;
			}
			
			if(data[cur] > data[child]) {
				break;
			}
			
			swap(cur, child);
			cur = child;
		}
		
		return ret;
	}
	
	void push(int num) {
		if(size + 1 >= data.length) {
			return;
		}
		
		data[++size] = num;
		int cur = size;
		
		while(cur > 1) {
			int parent = cur / 2;
			
			if(data[cur] > data[parent]) {
				swap(cur, parent);
				cur = parent;
			} else {
				break;
			}
		}
	}
}

public class Main {
	private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(in.readLine());
		Heap heap = new Heap(n);
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(in.readLine());
			
			if(num == 0) {
				out.write(heap.pop() + "\n");
			} else {
				heap.push(num);
			}
		}
		out.flush();
	}
}
