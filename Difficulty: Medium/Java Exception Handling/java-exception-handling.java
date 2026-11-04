
class Solution {
    public int findMin(int a, int b) {
        int min = a + b;

        min = Math.min(min, a - b);
        min = Math.min(min, a * b);

        try {
            int div = a / b;
            min = Math.min(min, div);
        } catch (ArithmeticException e) {
           
        }

        return min;
    }
}
