import java.util.*;

class Solution {

    int mean(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum / arr.length;
    }

    int median(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;

        if (n % 2 == 1) {
            return arr[n / 2];
        } else {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2;
        }
    }
}