class Solution {
    public int vowelCount(String s) {
        int[] count = new int[5];

        for (char ch : s.toCharArray()) {
            if (ch == 'a') count[0]++;
            else if (ch == 'e') count[1]++;
            else if (ch == 'i') count[2]++;
            else if (ch == 'o') count[3]++;
            else if (ch == 'u') count[4]++;
        }

        int unique = 0;
        int choices = 1;

        for (int i = 0; i < 5; i++) {
            if (count[i] > 0) {
                unique++;
                choices *= count[i];
            }
        }

        if (unique == 0) {
            return 0;
        }

        int factorial = 1;

        for (int i = 1; i <= unique; i++) {
            factorial *= i;
        }

        return choices * factorial;
    }
}