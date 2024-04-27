//JAVA LOOP CONTROL STATEMENT BREAK AND CONTINUE

//JUMP STATEMENT
import java.util.Scanner;

/*
 For a given n,find the nearest number divisible by 10 that is less then or equal to n
 
*/
public class Spartan15 {
 public static void main(String[] args) {
	 int n;
	 Scanner Ns = new Scanner(System.in);
	System.out.println("Enter the number");
	n = Ns.nextInt();
	
	while (true) {
		
		if(n%10==0) {
			System.out.println(n);
			break;
		}
		n--;	
}
}
}
/*
double n,sum=.0.0;
Scanner Ns = new Scanner(System.in);
System.out.println("Enter the number , enter a negative number to stop");

while(true) {
	n=scanner.nextDouble();
	if (n<0.0) {
		break;
	}
	sum=sum+n;  //enter panna panna add panna that is called accumulate
}
System.out.println(sum);
}
*/


/***************CONTINUE******************
 * 
      for(int i=1;i<=10;i++){
      if(i==7)
         continue;
         System.out.println(i)
         }
         
         o/p = 1,2,3,4,5,6,8,9,10
 */

