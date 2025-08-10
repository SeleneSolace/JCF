import java.util.*;
public class TaxisGreedy{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] count = new int[5];
        for(int i=0 ; i<n ;i++){
            count[sc.nextInt()]++;
        }
        int taxis=0;
        taxis += count[4];
        int pair31 = Math.min(count[3],count[1]);
        taxis += count[3];
        count[1] -= pair31;

        taxis += count[2]/2;
        if(count[2]%2 == 1){
            taxis++;
            count[1] -= Math.min(2,count[1]);
        }

        if(count[1] >0){
            taxis += (count[1] +3)/4;
        }
        System.out.println(taxis);
    }
}
