/*#10 CODING CHALLANGE 2 (PART-1)
Get input for Variable Income. if Income is
greater than 7000 scholarship is available.
Else not eligible for scholarship.*/

package challange2_part1;
import java.util.*;
public class Two {
    public static void main(String[] args) {
    	System.out.println("Enter your income");
		Scanner scan = new Scanner(System.in);
		int income = scan.nextInt();
		
		
		if(income>=7000) {
			System.out.println("Scolarship is Available");
		}
		else {
			System.out.println("Not Eligible for Scholarship");
		}

}
}
