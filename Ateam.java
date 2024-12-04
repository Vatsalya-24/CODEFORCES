import java.util.Scanner;

public class Ateam {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of problem:");
        int n = input.nextInt();
        input.nextLine();
        int count = 0;
        System.out.println("Enter the prefences by the  Petya, Vasya and Tonya respectively:");
        for(int i = 0; i<n;i++){
            System.out.println("Enter the prefences by the  Petya:");
            int p= input.nextInt();
            System.out.println("Enter the prefences by the  Vasya:");
            int v= input.nextInt();
            System.out.println("Enter the prefences by the  Tonya:");
            int t= input.nextInt();
            if((p==1 && v==1 && t==1) || (p==1 && v==1 && t!=1) || (p==1 && v!=1 && t==1) || (p!=1 && v==1 && t==1)){
                count++;
            }
            else{
                continue;
            }
        }
        System.out.println("the problem they will have solution of :" + count);

        input.close();
    }

}
