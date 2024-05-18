/*Create an integer array, Get input for 5 numbers
	and print their sum or total*/
package array;
import java.util.Scanner;
public class Array2 {
	
	    public static void main(String[] args) {
	    	
	    	System.out.println("Enter the numbers");
	    	int[] score = new int[5];
	    	Scanner scan = new Scanner(System.in);
		  
		      score[0]=scan.nextInt();
		      score[1]=scan.nextInt();
		      score[2]=scan.nextInt();
		      score[3]=scan.nextInt();
		      score[4]=scan.nextInt();
		      
		      System.out.println(score[0]+score[1]+score[2]+score[3]+score[4]);
		}
	}