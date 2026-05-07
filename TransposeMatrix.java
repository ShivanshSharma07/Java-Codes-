import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Transpose Matrix:");

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}