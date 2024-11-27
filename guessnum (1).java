
package guessnum;
import java.util.Scanner;
import java.util.Random;
public class Guessnum {

    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      Random r=new Random();
        System.out.println("please enter a number between 1-100");
        int number=r.nextInt(100);
        while(true){
      int user=input.nextInt();
        if(number==user){
            System.out.println("correct guss");
        }
        else if(number>user){
            System.out.println("more");
        }
        else if(number<user){
            System.out.println("less");
        }
        }
    }
    
}
