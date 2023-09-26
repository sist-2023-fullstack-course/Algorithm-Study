package com.sist.selfcoding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) {
        Integer[] arr = new Integer[3];
        try {

            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            int i=0;
            while (st.hasMoreTokens()){
                arr[i] = Integer.parseInt(st.nextToken());
                i++;
            }

            int ans = 0;
            Arrays.sort(arr, Collections.reverseOrder());

            if((arr[0] == arr[2])){
                ans = 10000 + arr[0]*1000;
            } else if((arr[0] == arr[1]) || (arr[1]) == (arr[2])){
                ans = 1000+arr[1]*100;
            } else {
                ans = arr[0]*100;
            }
            System.out.println(ans);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}