import java.util.*;
public class LessorEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        TreeMap<Integer,Integer> map = new TreeMap<>();

        for(int i=0 ;i<n;i++){
            int value = sc.nextInt();
            map.put(value,map.getOrDefault(value,0)+1);
        }

        if(k==0){
            int smallest = map.firstKey();
            int cand = smallest-1;
            if(cand >= 1) System.out.println(cand);
            else System.out.println(-1);
            return;
        }
        int count=0;
        if(k>0){
            for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
                count += entry.getValue();
                if(count == k){
                    int cand = entry.getKey();
                    System.out.println(cand);
                    return;
                }
                if(count >k){
                    System.out.println(-1);
                    return;
                }
            }
        }
    }
}
