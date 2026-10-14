class Solution {
    public static int[] colSum(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] result = new int[m];

        for (int j = 0; j < m; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += mat[i][j];
            }
            result[j] = sum;
        }

        return result;
    }
}