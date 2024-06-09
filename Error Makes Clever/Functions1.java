package functions;

public class Functions1 {
	
	void greetings() {
		System.out.println("wellcome");
	}
	void Default() {
		System.out.println("Default");
	}
	
	public static void main(String[] args) {
		Functions1 blackbox = new Functions1();
		blackbox.greetings();
		blackbox.Default();
	}

}
