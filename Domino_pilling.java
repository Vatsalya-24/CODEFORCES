import java.util.Scanner;
import java.math.*;

public class Domino_pilling {
    public static void main(String args[]){ 
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n= input.nextInt();
        System.out.println("Enter the rows of columns");
        int m = input.nextInt();        
        if((n*m)/2==0){
            System.out.println("The number of domino:"+(n*m)/2);
        }
        else{
            System.out.println("the number of domino:"+ Math.round((n*m)/2));
        }

        input.close();
    }
}
