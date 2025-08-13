import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NextRound {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inp = br.readLine().split(" ");
        int n = Integer.parseInt(inp[0]);
        int k = Integer.parseInt(inp[1]);
        int count=0;

       int[] arr = Arrays.stream( br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
       int target = arr[k-1];
       for(int score :arr){
           if((score >= target) && score>0) count++;
       }
        System.out.println(count);

    }
}
