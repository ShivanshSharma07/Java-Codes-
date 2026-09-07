import java.util.*;

class Solution {
    public void insertAtIndex(ArrayList<Integer> arr, int index, int val) {
        arr.add(index, val);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int index = 2;
        int val = 90;

        Solution obj = new Solution();
        obj.insertAtIndex(arr, index, val);

        System.out.println(arr);
    }
}