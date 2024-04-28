//JAVA ARRAY & LOOPS
import java.util.Scanner;
public class Spartan16 {
   public static void main(String[] args) {
	
	   int[] a = new int[6];
	   
	   Scanner Ns = new Scanner(System.in);
	   System.out.println("Enter 5 elements of the array");
	   
	   for(int i=0;i<a.length;i++)
	   a[i] = Ns.nextInt();
	   
	   for(int i=0;i<a.length;i++)
	   System.out.println(a[i]);
}
}
