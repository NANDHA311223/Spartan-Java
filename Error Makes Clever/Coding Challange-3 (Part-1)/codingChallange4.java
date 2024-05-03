/* Print the number which are divisible
by both 3 and 5
Range 1 to 100*/
package codingChallange3_Part1;
public class codingChallange4 {
     public static void main(String[] args) {
	for(int i=1;i<=100;i++) {
		if(i%3==0 && i%5==0) {
			System.out.println(i);
		}
	}
	}
}
