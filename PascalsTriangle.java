
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class PascalsTriangle {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());

        for(int i=0 ; i<n ;i++){
            int num=1;
            for(int j=0 ; j<=i ;j++){
                System.out.print(num + " ");
                num = num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
