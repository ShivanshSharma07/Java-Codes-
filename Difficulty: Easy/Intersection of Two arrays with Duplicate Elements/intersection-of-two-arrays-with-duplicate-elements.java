import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : a) {
            set.add(num);
        }

        for (int num : b) {
            if (set.contains(num)) {
                result.add(num); 
                set.remove(num); 
            }
        }

        return result;
    }
}