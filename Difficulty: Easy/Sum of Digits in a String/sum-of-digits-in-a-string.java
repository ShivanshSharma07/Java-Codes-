class Solution {
    String arrangeString(String s) {
        StringBuilder letters = new StringBuilder();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                letters.append(ch);
            } else {
                sum += ch - '0';
            }
        }

        char[] arr = letters.toString().toCharArray();
        java.util.Arrays.sort(arr);

        if (sum > 0) {
            letters = new StringBuilder(new String(arr));
            letters.append(sum);
            return letters.toString();
        }

        return new String(arr);
    }
}
