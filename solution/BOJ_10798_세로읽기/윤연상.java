import java.io.*;

public class 윤연상
{
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));


        String[] board = new String[5];
        for(int i=0;i<5;i++) {
            board[i] = in.readLine();
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<15;i++){
            for(int j=0;j<5;j++){
                if(board[j].length()>i)
                    sb.append(board[j].charAt(i));
            }
        }
        out.write(sb.toString());
        out.flush();
        out.close();
    }
}