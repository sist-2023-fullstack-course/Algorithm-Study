import java.io.*;
import java.util.Arrays;

/*
5
5
2
3
4
1
 */

public class Main {
	private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	
	
	// 버블 정렬  : O(n^2)
	static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	// 선택 정렬 : O(n^2)
	static void selectionSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int minIdx = i;
			int minValue = arr[i];
			
			for(int j=i+1;j<arr.length;j++) {
				if(minValue > arr[j]) {
					minIdx = j;
					minValue = arr[j];
				}
			}
			
			int tmp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = tmp;
		}
	}
	
	// 병합 정렬 : O(nlogn)
	static void mergeSort(int s, int e, int[] arr) {
		if(s >= e) {
			return;
		}
		
		int mid = (s + e) / 2;
		
		mergeSort(s, mid, arr);
		mergeSort(mid + 1, e, arr);
		
		int front = s;
		int back = mid + 1;
		int[] copy = Arrays.copyOf(arr, arr.length);
		
		for(int i=s;i<=e;i++) {
			if(front > mid) {
				arr[i] = copy[back++];
			}
			else if(back > e) {
				arr[i] = copy[front++];
			}
			else if(copy[front] < copy[back]) {
				arr[i] = copy[front++];
			} else {
				arr[i] = copy[back++];
			}
		}
	}
	
	// 퀵소트 : O(nlogn)
	static void quickSort(int[] arr, int s, int e) {
		if(s > e) return;
		
		int left = s;
		int right = e;
		int pivot = arr[(left + right) / 2];
		
		while(left <= right) {
			if(arr[left] < pivot) {
				left++;
				continue;
			}
			if(arr[right] > pivot) {
				right--;
				continue;
			}
			
			int tmp = arr[left];
			arr[left] = arr[right];
			arr[right] = tmp;
			left++; right--;
		}

		quickSort(arr, s, right);
		quickSort(arr, left, e);
	}
	
	public static void main(String[] args) throws IOException{
		int n = Integer.parseInt(in.readLine());
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(in.readLine());
		}
		
//		selectionSort(arr);
//		bubbleSort(arr);
//		mergeSort(0, arr.length-1, arr);
		quickSort(arr, 0, arr.length-1);
		
		for(int num : arr) {
			out.write(num + "\n");
		}
		out.flush();
	}
}
