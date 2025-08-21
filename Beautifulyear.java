import java.util.*;
public class Beautifulyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(true) {
            n++;
            String y = String.valueOf(n);
            HashSet<Character> set = new HashSet<>();

            for (char c : y.toCharArray()) set.add(c);
            if (set.size() == y.length()){
                System.out.println(y);
                break;
            }
        }
    }
}
