class Solution {
    public String longest(String[] arr) {
        String longestStr = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > longestStr.length()) {
                longestStr = arr[i];
            }
        }

        return longestStr;
    }
}