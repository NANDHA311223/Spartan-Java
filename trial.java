package Encapsulation;

 class mains{
	 private int a = 3;
	 
	 
	public int getA() {
		 System.out.print("Finally your getA was ");
		return a;
	}

	public void setA(int val) {
		System.out.println("you are updated the setA , Now it was changed ");
	    this.a = val;
	} 
 }
 
public class trial {
  public static void main(String[] args) {
	  System.out.println("main method started");
	  
	mains nk = new mains();
	nk.setA(99);
	System.out.println(nk.getA());
}
}
