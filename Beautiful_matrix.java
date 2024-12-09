import java.util.Scanner;

public class Beautiful_matrix {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Digit of 5 X 5 matrix ie 25 only 0 &  and only 1:");
        int [][] n = new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.println("value of "+ i +" x "+ j);
                n[i][j]=input.nextInt();
                if(n[i][j]!=0 || n[i][j]!=1){
                    System.out.println("Please understand type only 0");
                }
            }
        }
        int rows = 0;
        int coln = 0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(n[i][j]==1){
                    rows =i;
                    coln = j;
                }
            }
        }
        int count =0;
        while(rows!=2 && coln!=2){
            if(rows > 2){
                count++;
                rows--;
            }
            else if(rows<2){
                count ++;
                rows++;
            }
            if(coln>2){
                count ++;
                coln --;
            }
            else if(coln<2){
                count++;
                coln++;
            }
        }
        System.out.println(count);
        input.close();
    }
}
