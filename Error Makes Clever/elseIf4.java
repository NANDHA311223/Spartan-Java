/* 
#12 Coding challange-2(part-2)Q-4

 Question:
Get input for salary and age.
If salary greater than or equal to 20000 or age
less than or equal to 25,
get input for required loan amount. If not print
you are not eligible for
loan.
If required loan amount is less than or equal
to 50,000 print You are
eligible for loan. If it is greater than 50,000
print maximum loan amount
is 50000.
*/
package elseIf;
import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
public class elseIf4 {
     public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your salary");
		 int salary = scan.nextInt();
		 System.out.println("Enter your Age");
		 int age = scan.nextInt();
		 
		 
		 
		 if(salary>=20000 || age<25) {
			 System.out.println("You are elegible for loan");
			 
			 System.out.println("How much amount of loan you want recieved");
			 int loan = scan.nextInt();
		
			 if(loan<50000) {
				 System.out.println("Loan Available");
			 }
			 else {
				 System.out.println("Loan Not Available");
			 }
		 }
		 
     }
}
