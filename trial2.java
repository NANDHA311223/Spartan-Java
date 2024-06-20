package Encapsulation;

 class top{ 
	int size;
	
	public int getSize() {
		System.out.print("Finally your getSize was ");
		return size;
	}

	public void setSize(int chng) {
		System.out.println("you are updated the setSize , Now it was changed ");
		this.size = chng;
	}	 
	
 }

public class trial2 {
    public static void main(String []args) {
    	
    	top dash = new top();
    	dash.size = 6;
    	dash.setSize(33);
    	System.out.println(dash.getSize());
    	}
    }