import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder s = new StringBuilder();
        while(t-- >0){
            int n= sc.nextInt();
            String a = sc.next();
            int m= sc.nextInt();
            String b = sc.next();
            String k= sc.next();
            StringBuilder sb = new StringBuilder(a);
            int i=0;
            for(char c:k.toCharArray()){
                char[] arr = b.toCharArray();
                if(c=='D'){
                    sb.append(arr[i++]);
                }
                else if(c == 'V'){
                    sb.insert(0,arr[i++]);
                }
            }
            s.append(sb.toString()+"\n");
        }
        System.out.println(s.toString());
    }
}
