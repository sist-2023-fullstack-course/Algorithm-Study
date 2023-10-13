import java.util.Scanner;

public class Main {
    static int getRealNum(char c){
        return (c >= 'A' && c <= 'Z') ? c - 'A' + 10 : c - '0';
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String n = in.next();
        int b = in.nextInt();

        int ans = 0;
        for(int i=0;i<n.length();i++){
            ans = ans * b + getRealNum(n.charAt(i));
        }

        System.out.println(ans);
    }
}