import java.util.*;

public class DivbyThree {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
       Integer[] arr = new Integer[n];
       for(int i=0 ;i<n;i++){
           arr[i] = sc.nextInt();
        }
       Arrays.sort(arr,(a,b) ->{
           int countA = countbyThree(a);
           int countB = countbyThree(b);
           if(countA != countB){
               return Integer.compare(countB,countA);
           }else{
               return Long.compare( a, b);
           }
       });
       for(int x: arr) System.out.print(x+ " ");
       sc.close();
    }
    public static int countbyThree(int x){
        int count=0;
        while(x%3 == 0){
            x = x/3;
            count++;
        }
        return count;
    }
}
