package lottery;
import java.util.Scanner;
import java.util.Random;

public class Myfirstapp {

    public static void main(String[] args) {
   
        Scanner input=new Scanner(System.in);
        Random number=new Random();
        int user,winnumber;
        System.out.println("please enter a number btween 0-50");
        user=input.nextInt();
        winnumber=number.nextInt(50);
        if(user==winnumber){
            System.out.println("congrats you won 10000$");
        }
        else if(user>10&&user<15){
            System.out.println("congrats you won 5000$");
        }
        else if(user>30&&user<35){
            System.out.println("congrats you won 1000$");
        }
        else {
            System.out.println("you lost the game please try agian");
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    

}
