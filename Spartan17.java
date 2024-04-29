//FOREACH LOOP

//if we handle the array the special loop is Foreach loop
public class Spartan17 {

	public static void main(String[] args) {
		int arr[]= {5,6,7,8,9,2};
		int sum=0;
		
		for(int i=0;i<arr.length;i++);
		System.out.println();
		
		//Easy way to acces the array elements if below
		
		for(int x: arr) {//For each loop(For each x present in the array)
			sum+=x;
		}
			System.out.println("Sum is" + sum);
		}
	}
