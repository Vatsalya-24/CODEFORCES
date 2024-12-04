import java.util.Scanner;

public class A_Bit {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of operatiion:");
        int n = input.nextInt();
        input.nextLine();
        int x=0;
        for(int i=0;i<n;i++){
            System.out.println("enter the operration to be performed:");
            String oper = input.nextLine();
            if(oper.equals("x++")){
                x++;
            }
            else if(oper .equals( "++x")){
                ++x;
            }
            else if(oper.equals("x--")){
                x--;
            }
            else if(oper.equals("--x")){
                --x;
            }
            else{
                System.out.println("the given operation is not supported, try x++,++x,--x,x--");
            }
        }
        System.out.println("the value we have at last:"+ x);
        input.close();

    }
}
