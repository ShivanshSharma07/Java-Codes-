import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        double length = sc.nextDouble();

        System.out.print("Enter Breadth: ");
        double breadth = sc.nextDouble();

        double perimeter = 2 * (length + breadth);

        System.out.println("Perimeter = " + perimeter);
    }
}