import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;


public class Helpful_math {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string madam gaved: ");
        String Sum_ran=input.nextLine();
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<Sum_ran.length();i++){
            if(Sum_ran.charAt(i) != '+'){
                result.add(Character.getNumericValue(Sum_ran.charAt(i)));
            }
        }
        Collections.sort(result);
        for(int i=0;i<result.size();i++){
            if(i<result.size()-1){
                System.out.print(result.get(i)+"+");
            }
            else{
                System.out.print(result.get(i)); 
            }
        }
        input.close();
    }
}
