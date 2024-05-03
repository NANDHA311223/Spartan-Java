/*
 #12 Coding challange-2(part-2)Q-1
 
Question: 
What is the score in a game?
- If the score is less than 50, print "You need
to improve."
- If the score is between 50 and 70
(inclusive), print "Good job!"
- If the score is greater than 70, print
"Excellent performance!"
*/
package elseIf;
import java.util.Scanner;
public class elseIf1 {
	
	   public static void main(String[] args) {
		
		   System.out.println("Enter your Score");
		  Scanner Ns = new Scanner(System.in);
		  int score = Ns.nextInt();
		  
		  if (score<50) {
		    System.out.println("You need to improve)");
	}
	      else if (score>=50 && score<=70){
		   System.out.println("Good job");
		   
	}
	      else if(score>70) {
	    	  System.out.println("Excellant Performance");
	      }
	}
	}
