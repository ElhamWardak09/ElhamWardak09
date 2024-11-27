package addition;
import java.util.Random;
import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
Random r=new Random();

       while(true){
           System.out.println("what is the sum for");
           int a=r.nextInt(50);
System.out.println(a);
int b=r.nextInt(100);
System.out.println(b);
int result;
     result=input.nextInt();
if(result==a+b){
    System.out.println("the answer is correct");
break;
}
else{
    System.out.println("the answer is wrong");
}
       }
  
  
  
  
  
  
  
  
  
   }
        

    }
    


