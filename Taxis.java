import java.io.*;
import java.util.*;

public class Taxis {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        String[] parts = br.readLine().trim().split("\\s+");

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) arr.add(Integer.parseInt(parts[i]));
        Collections.sort(arr,Collections.reverseOrder());

        LinkedList<Integer> groups = new LinkedList<>(arr);

        int taxis = 0;
        while(!groups.isEmpty()){
            int space = 4;
            space -= groups.removeFirst();
            taxis++;
            Iterator<Integer> it = groups.iterator();
            while(it.hasNext() && space > 0){
                int g = it.next();
                if(g<=space){
                    space -= g;
                    it.remove();
                }
            }
        }
        System.out.println(taxis);
    }
}
