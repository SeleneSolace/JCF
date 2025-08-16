import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class JavaMap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Long> map = new TreeMap<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        while(n-- >0){
            String name = br.readLine();
            Long num = Long.parseLong(br.readLine());
            map.put(name,num);
        }
        String query ;
        while((query = br.readLine()) != null){
            if(map.containsKey(query)) sb.append(query+ "=" +map.get(query)+"\n" );
            else sb.append("Not found\n");
        }
        System.out.println(sb);
    }
}
