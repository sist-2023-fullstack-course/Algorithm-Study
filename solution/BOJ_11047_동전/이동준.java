import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 동전의 종류 만큼 수행 O(N) logN은 어쩔때 인가...
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        try {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int[] coins = new int[Integer.parseInt(st.nextToken())];
            int price = Integer.parseInt(st.nextToken());
            int count = 0;

            for (int i = 0; i < coins.length ; i++) {
                coins[i] = Integer.parseInt(br.readLine());
            }

            for (int i = coins.length-1; i >=0 ; i--) {
                if(coins[i]>price)
                    continue;
                count += price/coins[i];
                price %= coins[i];
                if (price == 0)
                    break;
            }
            System.out.println(count);

        } catch ( Exception e){
            e.printStackTrace();
        }


    }
}

