import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        String binary = "";

        while (decimal > 0) {

            binary = (decimal % 2) + binary;
            decimal = decimal / 2;
        }

        System.out.println("Binary Number = " + binary);

        sc.close();
    }
}