import java.util.Scanner;
public class watermelon{

    public static void main(String[] args) {
        int w;
        Scanner input = new Scanner(System.in);

        w = input.nextInt();
        
        if(w%2==0 && w>2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}