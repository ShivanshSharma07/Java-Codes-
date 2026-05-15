import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        String hexadecimal = Integer.toHexString(decimal).toUpperCase();

        System.out.println("Hexadecimal Number = " + hexadecimal);

        sc.close();
    }
}