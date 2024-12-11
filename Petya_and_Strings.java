import java.util.Scanner;

public class Petya_and_Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the String one:");
        String first = input.nextLine();

        System.out.println("Enter the String two:");
        String two = input.nextLine();

        first = first.toLowerCase();
        two = two.toLowerCase();

        int comparison = first.compareTo(two);

        if (comparison < 0) {
            System.out.println("-1");
        } else if (comparison > 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        input.close();
    }
}
