import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();

        int decimal = 0;
        int power = 0;

        while (binary > 0) {

            int digit = binary % 10;
            decimal += digit * Math.pow(2, power);

            binary = binary / 10;
            power++;
        }

        System.out.println("Decimal Number = " + decimal);

        sc.close();
    }
}