import java.util.Scanner;

public class Next_Round {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elemnt you have:");
        int n = input.nextInt();
        System.out.println("Enter the number of element: ");
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the kth palce finisher:");
        int finisher = input.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>=arr[finisher-1]){
                count++ ;
            }
        }
        System.out.println("No. of candidate in the next round: ");
        System.out.println(count);
        input.close();
    }
}
