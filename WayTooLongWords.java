import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of words:");
        int n = input.nextInt(); 
        input.nextLine(); 

        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            String w = input.nextLine(); 
            if (w.length() > 10) {
                String abbreviated = w.charAt(0) + String.valueOf(w.length() - 2) + w.charAt(w.length() - 1);
                System.out.println(abbreviated);
            } else {
                System.out.println(w); 
            }
        }
        input.close();
    }
}
