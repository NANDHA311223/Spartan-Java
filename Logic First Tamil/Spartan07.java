/*Bitwise Operators
 & AND                  1 & 1 = 1
 | OR                   0 & 0 = 0
 ~ NOT (Compliment)     reciprocal of 0&1
 ^ EXOR(Exclusive or)   0&1 or 1&0 = 1
 >>                     right shift
 <<                     left shift
 >>>                    right shift zero fill    
 */

public class Spartan7 {
	public static void main(String[]args) {
		byte a=4;
 System.out.println((byte)a>>1);//In bitwise operator byte and short promoted in to int 
	}
}
/*
>>1st & last place in (0000 0100)depends on sigh fill this place
>>right shift by 1 is equal to divided by 2
>>every bit handled bit by bit ,So it is called bitwise optr
>>System.out.println((byte)a<<1);  Left shift shift
>>System.out.println((byte)a>>1);  Right shift
>>System.out.println((byte)a>>>1); Right shift  zero fill
>>Compound assignments(a^=b) also used in bitwise optr
1=true
0=false
Negative numbers are stored in 2's Complement
*/
