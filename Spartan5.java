//ARITHMETIC OPERATORS 

/*
+=ADDITION
-=SUBTRACTION
*=MULTIPLICATION
/=DIVISION
%=MDULOUS => means get reminder value of division method */

public class Spartan5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=10,c=2,d=3,e=4,f=5,g=6;//if we want precise vlues give dfrnt data types
		c=a+b;//=is assignment operators,a/b are oparants
		a=c-b;
		b=a*c;
		d=c/e;
		e=g%c;
		System.out.println(c+a-b*d/e);
	 
	/*
	 >>>COMPOUND ASSIGNMENT<<<
	   a=a+3; insted of a+=3;
	 
	 
	>>>INCTEMENT/DECREMENT<<<
	c = a++; = Post increment (first a stored in c then a will increase)
	    ++a; = pre increment
	 
        c = a--; = Post decrement(first a will increase then a stored in c )
	    --a; = pret decrement
	 */
	}

}
