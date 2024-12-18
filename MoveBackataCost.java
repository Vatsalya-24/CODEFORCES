import java.util.Scanner;


public class MoveBackataCost {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the number of Array:"); 
       int n = input.nextInt();
       for(int i=0;i<n;i++){
        System.out.println("Enter the size of " +i+"array:");
        int size_=input.nextInt();
        int [] num =new int[size_];
        for(int j=0;j<size_;j++){
            System.out.println("Enter your elemnet"+j);
            num[j]=input.nextInt();
        }
       }
       

    }
}
