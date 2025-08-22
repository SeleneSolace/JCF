import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BeautifulMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int row = 0, col = 0;

        for (int i = 1; i <= 5; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 5; j++) {
                int val = Integer.parseInt(st.nextToken());
                if (val == 1) {
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println(Math.abs(row - 3) + Math.abs(col - 3));
    }
}

