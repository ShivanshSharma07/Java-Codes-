class Solution {
    public int[] rowSum(int[][] mat) {
        int[] result = new int[mat.length];

        for (int i = 0; i < mat.length; i++) {
            int sum = 0;

            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }

            result[i] = sum;
        }

        return result;
    }
}