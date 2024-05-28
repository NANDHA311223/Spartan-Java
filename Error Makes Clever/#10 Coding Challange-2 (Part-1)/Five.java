/*#10 CODING CHALLANGE 2 (PART-1)
Get input for a number and check whether it is
divisible by both 3 and 5 or not. if yes then
print, the number is divisible by 3 and 5 print
the number is not divisible by 3 and 5.

How to find whether a Number is Divisible by 3 or Not?*/

package challange2_part1;
import java.util.Scanner;
public class Five {
         public static void main(String[] args) {

      System.out.println("Enter the Number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        	 		
       if(number%3==0&&number%5==0) {
    	   System.out.println("yes");
       }
       else {
    	   System.out.println("No");
       }
		}
}
