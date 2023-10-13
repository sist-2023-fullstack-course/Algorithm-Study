import java.util.Scanner;

public class Main {
    static char getCharNum(int n){
        return (char) ((n >= 10) ? n - 10 + 'A' : n + '0');
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b = in.nextInt();

        StringBuilder ans = new StringBuilder();
        while(n > 0){
            ans.append(getCharNum(n % b));
            n /= b;
        }
        System.out.println(ans.reverse());
    }
}