import java.io.*;
public class AlternatingSeries {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while(t-- >0){
            int n = Integer.parseInt(br.readLine());

            if(n ==2){
                sb.append("-1 2\n");
                continue;
            }
            for(int i=1 ;i<=n;i++){
                if(i%2 !=0){
                    sb.append("-1");
                } else if (i == n) {
                    sb.append("2");
                }else sb.append("3");
                if(i<n) sb.append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
