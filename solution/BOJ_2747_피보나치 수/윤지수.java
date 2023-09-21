import java.util.*;
import java.io.*;
public class 윤지수{
    public static void pibonachi(int n)
    {
        int[] arr=new int[n+1];
        arr[1]=1;
        for(int i=2;i<=n;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(arr[n]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(in.readLine());
        pibonachi(n);
    }
}
