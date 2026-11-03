
import java.math.BigInteger;

class Solution {
    static BigInteger factorial(int n) {

        BigInteger fact = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        return fact;
    }
}
