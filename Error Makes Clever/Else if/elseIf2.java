/* 
#12 Coding challange-2(part-2)Q-2

Question:
get input for five subjects marks. Add all of it,
And find average. If
average mark is less than 35. Print "Additional
class is required" else
Print "you are good to go"
*/
package elseIf;
import java.util.Scanner;
public class elseIf2 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s1 = scan.nextInt();
		int s2 = scan.nextInt();
		int s3 = scan.nextInt();
		int s4 = scan.nextInt();
		int s5 = scan.nextInt();
		
		int totalmark = s1+s2+s3+s4+s5;
		int avg = totalmark/5;
		
		if(avg<35) {
			System.out.println("Additional class required");
		}
		else {
			System.out.println("You are good to gro");
		}
	}
}
