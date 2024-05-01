//JAVA GETTING USER INPUT
import java.util.*;
public class Spartan4 {
public static void main (String[]args) {
	/* For Example
	  int a ( int=Data type, a=variable)
	(Scanner = class name , scanner = object)*/
	Scanner scanner = new Scanner (System.in);//System.in) = pre defined object of i/p stream 
	
	//to store in string
	System.out.println("what is your name?");
	String name = scanner.nextLine();
	System.out.println(" Hello " + name);
	
	//To store in int
	System.out.println("What is your rating from 1 to 5?");
	int rating =scanner.nextInt();
	System.out.println("you rared us " + rating);//you rared as " + rating = the + is called Concordinate
     
	//To store in Short
	System.out.println("Enter the rating 6 to 10");
	short ratings = scanner.nextShort();
	System.out.println("you rated us " + ratings);
	scanner.nextLine();/* 
	If we press enter immediately to scan a number,
	 it will also take the next line char,
	  so our mail id not Shows Then only we use 
	  >>>scanner.nextLine();<<< if we use this statement
	 our enter key as scanned but not stored So the problem will be clear*/
	
	System.out.println("Enter your email");
	String mail = scanner.nextLine();
	System.out.println("Your mail is " + mail);
	
}
}
