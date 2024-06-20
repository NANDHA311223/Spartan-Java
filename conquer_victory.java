//Encapsulation , Getter & Setter
package Encapsulation;

 class nandhu1{
	private int age=18; //inside a class variable is caled instance variable

	public int getAge() {
		System.out.print("Finally your getAge was ");
		return age;
	}
    public void setAge(int val) {
		System.out.println("you are updated the setAge , Now it was changed ");
		this.age = val;
	}
 }

public class conquer_victory {
  public static void main(String[] args) {
	  nandhu1 nk=new nandhu1();
	  nk.setAge(20);
	  System.out.println(nk.getAge());
}
}
