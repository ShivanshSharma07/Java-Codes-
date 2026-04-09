import java.util.Scanner;

public class StringLengthRecursion {

    static int length(String str) {

        if (str.equals(""))
            return 0;

        return 1 + length(str.substring(1));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int len = length(str);
        System.out.println("Length of string = " + len);
    }
}