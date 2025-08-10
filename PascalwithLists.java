import java.util.*;
public class PascalwithLists {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> triangle = new ArrayList<>();

            for (int i = 0; i < numRows; i++) {
                List<Integer> row = new ArrayList<>();
                int num = 1; // first number in every row is 1

                for (int j = 0; j <= i; j++) {
                    row.add(num);
                    // formula for next element in the row:
                    num = num * (i - j) / (j + 1);
                }

                triangle.add(row);
            }

            return triangle;
        }
    }

