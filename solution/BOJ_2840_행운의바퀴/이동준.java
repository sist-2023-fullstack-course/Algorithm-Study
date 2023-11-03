import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        try {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            // 첫줄 입력
            int kan = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            int index = 0;

            //배열 초기화
            char arr[] = new char[kan];
            for (int i = 0; i < kan; i++) {
                arr[i] = '?';
            }

            // 알고리즘
            for(int i = 0; i<num; i++){
                st = new StringTokenizer(br.readLine()," "); //움직인 칸수 와 문자
                int move = Integer.parseInt(st.nextToken());
                char c = st.nextToken().charAt(0);

                // 배열의 인덱스 처리, 움직인 만큼 다음 배열에 입력
                index += move%kan;
                if(index>(kan-1)){
                    index -= kan;
                }

                if(arr[index] != '?' && arr[index] != c){
                    System.out.println('!');
                    return;
                }

                for (int j = 0; j < kan; j++) {
                    for (int k = j+1; k < kan; k++) {
                        if(arr[j] != '?' && arr[j] == arr[k]){
                            System.out.println('!');
                            return;
                        }
                    }
                }

                arr[index] = c;
            }

            //결과 출력
            for (int i = 0; i < kan; i++) {
                sb.append(arr[(index+(kan - i)) % kan]);
            }
            System.out.println(sb);


        } catch (Exception e){
            e.printStackTrace();
        }

    }
}