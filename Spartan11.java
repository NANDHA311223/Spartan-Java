/*SWITCH STATEMENT
1.called alternator of the if/else
2.When will we use switch? Having multiple scenarios= we operaye case by case
3.Switch and if/else are SELECTION STATEMENT
4.Switch statement is not a manditory but if/else is Must */
import java.util.*;
public class Spartan11 {
    public static void main(String[]args) {
    	int a,b;
    	Scanner Nandhu = new Scanner(System.in);
    	System.out.println("Enter first number");
    	a=Nandhu.nextInt();
    	System.out.println("Enter second number");
    	b=Nandhu.nextInt();
    	char operator;
    	System.out.println("Enter the operator +,-,*,/ or %");
    	operator = Nandhu.next().charAt(0);//To scan the char
                                          //Strings/array first index is zero   	
           switch(operator) {
           case'+':
        	   System.out.println(a + " + " + b + " = " + (a+b));
         	   break;
           case'-':
        	   System.out.println(a + "-" + b + "=" +(a-b));
        	   break;
           case'*':
        	   System.out.println(a + "*" + b + "=" +(a*b));
        	   break;
           case'/':
        	   System.out.println(a + "/" + b + "=" +(a/b));
        	   break;
           case'%':
        	   System.out.println(a + "%" + b + "=" +(a%b));
        	   break;
           default://usually we use in last , but it will use in starting or middle , we added break
        	   System.out.println("You have entered a ircorrect ");
           }
           
    }
    
}