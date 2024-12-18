package Searching;
import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int Sizeofarray = input.nextInt();
        int [] array = new int[Sizeofarray];
        for(int i=0;i<Sizeofarray;i++){
            System.out.print("Enter the value of array position : "+ (i+1));
            array[i]=input.nextInt();
        }
        System.out.println("Enter the value want to search: ");
        int searchfor = input.nextInt();
        for(int i=0;i<Sizeofarray;i++){
            if(array[i]==searchfor){
                System.out.println("found at "+ (i+1));
                break;
            }
           else{
            System.out.println("Not found at"+ (i+1));
           }
        }
        input.close();

    }
}
