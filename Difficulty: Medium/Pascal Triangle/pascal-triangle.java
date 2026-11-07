import java.util.*;

class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        long value = 1;

        for (int i = 0; i < n; i++) {
            ans.add((int) value);
            value = value * (n - 1 - i) / (i + 1);
        }

        return ans;
    }
}
