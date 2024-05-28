/*#10 CODING CHALLANGE 2 (PART-1)
Get Input for a number and find it is even or
odd Number.*/
package challange2_part1;

import java.util.Scanner;
public class Six {
    public static void main(String[] args) {

   System.out.println("Enter the Number");
   Scanner scan = new Scanner(System.in);
   int number = scan.nextInt();
   	 		
  if(number%2==0) {
	   System.out.println(number + " is a even number");
  }
  else {
	   System.out.println(number + " is a odd number ");
}
}
}
