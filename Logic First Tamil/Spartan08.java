/*  //TOPIC : SHORT CKT LOGICAL OPERATORS && ||
  
 BOOLEAN OPERATORS:
 & AND                 
 | OR                   
 ~ NOT (Compliment)     
 ^ EXOR(Exclusive or) 
 >>  right shift
 <<  left shift
 >>> right shift zero fill 
 */
public class Spartan8 {
	public static void main(String[]args) {
//The bit wise operators also we use as boolean operators
		
/*boolean a=true,b=false;//1=True,0=False
		System.out.println(a&b);*/
	
//SHORT CKT LOGICAL OPERATORS && ||	
		int a=12;
/*System.out.println((a>20) & (a<30));
    Called(Bitwise Operator - checking a&b then give result)*/
		System.out.println((a>20) && (a<30));
		 //Called(Short circuit operator-avoided b checking)
/*System.out.println((a<20) | (a>30));
	Called(Bitwise Operator - checking a&b then give result) */
		//System.out.println((a<20) || (a>30));
		 //Called(Short circuit operator-avoided b checking)
	}
}
//SHORT CKT LOGICAL OPERATORS is fast (mostly used to combine relational operators)

//TOPIC : OPERATOR PRECEDENCE
/*combination of all the operators,operants , variables,constants
     these all the combination is called expressions
     
     
    int a=10,b=25;
    double c= (a*b-10)/a; //Paranthases will be have higher priority
   
   
    //PRESEDENCE OF OPERATORS:
 Post priority
    Arithmetic oprtr
    Shift oprtr
    Cmparison Oprtr
    Equality ckng oprtrs
    bit wise oprtr
    Short ckt oprtr
    Cndnal oprtr
    assignment oprtr
*/
