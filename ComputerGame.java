import java.util.*;
import java.io.*;

import static java.lang.Math.floor;

public class ComputerGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(t-- >0){
            String[] parts = br.readLine().split(" ");
            long k = Long.parseLong(parts[0]);
            long n = Long.parseLong(parts[1]);
            long a = Long.parseLong(parts[2]);
            long b = Long.parseLong(parts[3]);
            if(n*b >= k){
                sb.append(-1+"\n");
                continue;
            }
            if(n*a<k){
                sb.append(n+"\n");
                continue;
            }
            long x=(k - (n * b) - 1) / (a - b);
            if(x<0) x=0;
            if(x>n) x=n;
            sb.append(x+"\n");
        }
        System.out.println(sb);
        br.close();
    }
}
