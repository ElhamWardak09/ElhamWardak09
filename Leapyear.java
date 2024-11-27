
package leapyear;
import java.util.Scanner;
public class Leapyear {

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("please enter a year to check if its a leap year");
        int year=input.nextInt();
        if(year%4==0&&year%100!=0){
            System.out.println("its a leap year ");
        }
        else{
            System.out.println("its not a leap year");
        }  
               
        
        
        
        
    }
    
}
