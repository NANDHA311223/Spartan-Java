//ARRAYS
/*
1.More values are stored in single space
2.Array index are always starts with 0
  Index are also called subscript
  The last subscript is size -1
3. For eg; 
      int marks[]=new int[50];
int(Data types) marks(Variable name)[](Array)= new int[50](Allocate the memory space for 50 variaables)
4.To access using subscript
5.If we don't assign the value , the value will be inistisalized as zero
6.Array can only access in loops
7.IN single array we can store Multiple dfrnt values called two dimensional array
8.Two dimensional array[][] = array of arrays
9.We using more [][][][] Called MULTI DIMENSIONAL ARRAY
1st[] = Number of rows
2md[] = Number of columns
The array symbol can be declared(int[] ball=new int[];) this (using middle) also
char[]c1,c2,c3; This will be declared by 3char array
*/
public class Spartan12 {
	public static void main(String[]Args) {
		int marks[] = new int[6];
		
//if we initialise all the values must cmplt in 1st line
		/*int marks[]= {60,70,80,90,40}; 
		//Array constants can only be used in intializers
		*/
		marks[0]=2;
		marks[1]=3;
		marks[3]=4;
		System.out.println(marks[3] + marks[1]);
	}

}
