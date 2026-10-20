class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        
        int gcd = findGcd(a, b);
     
        int lcm = (a / gcd) * b; 

        return new int[]{lcm, gcd};
    }

    private static int findGcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            
            b = a % b;
            a = temp;
        }
        return a;
    
}
}