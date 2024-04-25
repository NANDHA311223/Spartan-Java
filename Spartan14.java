//NESTED LOOPS

/* Loop inside another loop called xxx
 
 */
public class Spartan14 {
  public static void main(String[] args) {
	  outerLoop: //Labels
	  for(int i=1;i<=5;i++) {
       innerLoop:
	  for(int j=1;j<=5;j++) {
		  if(i==3 && j==3)
			  break;
		  //Break outerloop called labelled break
	System.out.print(j);
	//print i = o/p is 11111,22222,33333,44444,55555
	//print j = o/p is 12345,12345,12345,12345,12345
}
	  System.out.println("\n");
}
}
}