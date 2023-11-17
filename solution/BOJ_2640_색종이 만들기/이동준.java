import java.io.*;
import java.util.StringTokenizer;

//색종이 만들기
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[][] canvas;
    static int white, blue = 0;

    public static void partition(int i, int j, int size){
        //색상이 같은지 비교
        if (comColor(i, j, size)){
            //같다면 색상 확인 후 해당 색종이 수 증가
            if( canvas[i][j]== 0){
                white++;
            }
            else {
                blue++;
            }
            return;
        }
        int nSize = size/2;
        partition(i, j, nSize);
        partition(i,j+nSize,nSize);
        partition(i+nSize,j,nSize);
        partition(i+nSize,j+nSize, nSize);
    }

    public static boolean comColor(int i, int j, int size){
        int color = canvas[i][j];
        for (int k = i; k < i+size; k++) {
            for (int l = j; l < j+size ; l++) {
                if(color != canvas[k][l])
                    //색상이 다르다면 재귀 호출
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        canvas = new int[N][N];

        // 도화지 초기화
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for (int j = 0; j < N; j++) {
                canvas[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        partition(0,0,N);

        System.out.println(white);
        System.out.println(blue);

    }
}
