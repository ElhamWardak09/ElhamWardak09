package afgnum;
import java.util.Scanner;

public class Afgnum {

    public static void main(String[] args) {
  
Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
String afgnum=input.next();

if(afgnum.length()==10&&afgnum.startsWith("079")){
    System.out.println("the called number is roshan");
}
else if(afgnum.length()==10&&afgnum.startsWith("077")||afgnum.startsWith("076")){
    System.out.println("the called number is MTN");
}
else if(afgnum.length()==10&&afgnum.startsWith("078")){
    System.out.println("you called a etisalat numbeer");
}
else if(afgnum.length()==10&&afgnum.startsWith("074")){
    System.out.println("you called a salam number");
}
else if(afgnum.length()==10&&afgnum.startsWith("070")||afgnum.startsWith("071")){
    System.out.println("'you called afghan bisim number");

}
else{System.out.println("wrong number");}
   }
        

    }
    


