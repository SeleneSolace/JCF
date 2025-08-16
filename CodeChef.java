import java.io.IOException;
import java.util.*;

public class CodeChef {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(t-->0){
            int n =sc.nextInt();
            long k = sc.nextLong();
            Queue<Long> pq = new LinkedList<>();
            boolean flag = true;
            for(int i=0 ;i<n;i++){
                long weight = sc.nextLong();
                pq.add(weight);

                if(weight>k) flag = false;
            }
            if(!flag){
                sb.append(-1+"\n");
                continue;
            }
            int trips=1;
            long sum=0;
            while(!pq.isEmpty()){
                long cur = pq.poll();
               if(sum+cur>k){
                   trips++;
                   sum = cur;
                }else sum += cur;
            }
            sb.append(trips+"\n");
        }
        System.out.println(sb);
        sc.close();
    }
}
