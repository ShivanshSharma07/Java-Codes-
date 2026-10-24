class Solution {
    public List<String> powerSet(String s) {
        List<String> result = new ArrayList<>();
        int n = s.length();
        int totalSubsequences = 1 << n; // 2^n

        for (int i = 0; i < totalSubsequences; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
        
                if ((i & (1 << j)) != 0) {
                    sb.append(s.charAt(j));
                }
            }
            result.add(sb.toString());
        }

      
        Collections.sort(result);
        return result;
    }
}