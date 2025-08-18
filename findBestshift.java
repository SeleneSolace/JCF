import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int findBestshift(String A,String B){
        int n = A.length();
        String doubledB = B+B;
        int maxlen= -1;
        int bestshift =0;
        for(int shift=0;shift<n;shift++){
            int curlen =0;
            while((curlen<n) && (A.charAt(curlen) == doubledB.charAt(shift+curlen))){
                curlen++;
            }
            if((curlen>maxlen)||((curlen==maxlen)&&(shift<bestshift))){
                maxlen = curlen;
                bestshift=shift;
            }
        }
        return bestshift;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long N = Long.parseLong(br.readLine());
        String A = br.readLine();
        String B = br.readLine();
        if((A.length()!=N)||(B.length()!=N)) return;
        System.out.println(findBestshift(A,B));
    }
}
