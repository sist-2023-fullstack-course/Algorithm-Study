import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static final BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException{
        String line;

        double cnt = 0;
        double totalScore = 0.0;
        while((line = in.readLine()) != null){
            String[] lecture = line.split(" ");

            double score;
            if(lecture[2].equals("A+"))
                score = 4.5;
            else if(lecture[2].equals("A0"))
                score = 4.0;
            else if(lecture[2].equals("B+"))
                score = 3.5;
            else if(lecture[2].equals("B0"))
                score = 3.0;
            else if(lecture[2].equals("C+"))
                score = 2.5;
            else if(lecture[2].equals("C0"))
                score = 2.0;
            else if(lecture[2].equals("D+"))
                score = 1.5;
            else if(lecture[2].equals("D0"))
                score = 1.0;
            else
                score = 0.0;

            if(!lecture[2].equals("P")){
                totalScore += score * Double.parseDouble(lecture[1]);
                cnt += Double.parseDouble(lecture[1]);
            }
        }

        double avgScore = totalScore / cnt;

        out.write(String.valueOf(avgScore));
        out.flush();
    }
}