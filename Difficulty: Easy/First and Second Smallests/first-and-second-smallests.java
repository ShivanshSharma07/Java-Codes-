import java.util.*;

class Solution {
    public ArrayList<Integer> minAnd2ndMin(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } 
            else if (num > smallest && num < secondSmallest) {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            result.add(-1);
            return result;
        }

        result.add(smallest);
        result.add(secondSmallest);

        return result;
    }
}