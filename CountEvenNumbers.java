import java.util.Scanner;

public class CountEvenNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                count++;
            }
        }

        System.out.println("Total even numbers = " + count);

        sc.close();
    }
}