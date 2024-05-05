//getting input using array & forloop
package codingChallange3Part2;
import java.util.Scanner;
public class CodingChallange1 {
   public static void main(String[] args) {
	   
	 Scanner scan = new Scanner(System.in);
	 int[]marks = new int[6];
	 
	 for(int i=0;i<=5;i++) {
	 marks[i]=scan.nextInt();
	 }
	 for(int i=0;i<=5;i++) {
	 System.out.println(marks[i]);
	 }
//  System.out.println(marks[0]);
//  System.out.println(marks[1]);
//  System.out.println(marks[2]);
//  System.out.println(marks[3]);
//  System.out.println(marks[4]);
//  System.out.println(marks[5]);
//   
}
}
