class Solution {
    int isdivisible7(String s) {
        int rem = 0;

        for (int i = 0; i < s.length(); i++) {
            rem = (rem * 10 + (s.charAt(i) - '0')) % 7;
        }

        return rem == 0 ? 1 : 0;
    }
}
