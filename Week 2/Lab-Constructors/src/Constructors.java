
public class Constructors {
	
	public Constructors(int value){
		System.out.println("Default Constructor ran.");
	}

	public static void main(String[] args) {
		//create instances here
		Constructors c = new Constructors(5839);
		
		//use the no-arg constructor
		Constructors cNoArg = new Constructors();
	}
}