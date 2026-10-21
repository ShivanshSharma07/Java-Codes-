class Solution {
public boolean checkPangram(String s) {
boolean[] seen = new boolean[26];
int count = 0;


    for (int i = 0; i < s.length(); i++) {
        char ch = s.charAt(i);

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch - 'A' + 'a');
        }

        if (ch >= 'a' && ch <= 'z') {
            int index = ch - 'a';

            if (!seen[index]) {
                seen[index] = true;
                count++;
            }
        }
    }

    return count == 26;
}

}
