//Get Even Number
package codingChallange3_Part1;
import java.util.Scanner;
public class codingChallange2 {
    public static void main(String[] args) {
        
   	 Scanner scan = new Scanner(System.in);
    System.out.println("Enter 1st number");
		int a=scan.nextInt();
	 System.out.println("Enter last number");
		int b=scan.nextInt();
        
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				System.out.println("Even Nember"+i);
			}
			
		}
    }
}
