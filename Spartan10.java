//IF ELSE STATEMENT
import java.util.*;
public class Spartan10 {
   public static void main(String[]args) {
	   int num;
	   Scanner nandhu = new Scanner(System.in);
	   System.out.println("Enter a number:");
	   num = nandhu.nextInt();
	   
	   if(num>0){
		   System.out.println(num + " is positive ");
	   }
	   else if(num==0) {
		   System.out.println(num + " is nuetral ");
		   }
		   else {
		   System.out.println(num + " is negative ");
	   }    
	 }
   }

/*
 TRY:GRADES
 if(mark>=90)
              Syso("grade A);
 else if(mark>=80)
              Syso("grade B);
 else if(mark>=70)
              Syso("grade C);
 else if(mark>=60)
              Syso("grade D);
 else
              Syso("grade E);
 
 */
