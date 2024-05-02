/*#12 Coding challange-2(part-2)Q-3
 
 Question:
  What is the color of the traffic light?
- If the answer is "red," print "Stop."
- If the answer is "yellow," print "Get Ready"
- If the answer is "green," print "Go."
 */

package elseIf;
import java.util.Scanner;
public class elseIf3 {
     public static void main(String[] args) {
		Scanner Ns = new Scanner(System.in);
		System.out.println("What is the color of Traffic light?");
	      
	    String color = Ns.nextLine();
	    
	    if(color.equals("Red")){
	    	System.out.println("Stop");
	    }
	    else if(color.equals("Yellow")){
	    	System.out.println("Ger Ready");
	    }
	    else if(color.equals("Green")) {
	    	System.out.println("Go");
	    }
	    else {
	    	System.out.println("You input is Wrong");
	    }
     }
}
