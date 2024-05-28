/*#10 CODING CHALLANGE 2 (PART-1)
 * Get input for Variable Mark. If mark > 35 print
pass. Else Print fail.
*/
package challange2_part1;
import java.util.*;
public class one {
    public static void main(String[] args) {
    	System.out.println("Enter your mark");
		Scanner scan = new Scanner(System.in);
		int mark = scan.nextInt();
		
		if(mark>=35) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
}
