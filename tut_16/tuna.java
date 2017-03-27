package tut_16;

public class tuna {
	// Public  Variable - Any class can use it!!!
	// Private Variable - Only the method inside this class can use it!!!
	//                    (manipulate, change and access this variable)
	private String girlName;
	
	public void setName(String name){
		// Initializing the local var from external!!!
		girlName = name;
	}
	
	public String getName(){
		return girlName;
	}
	
	public void saying(){
		System.out.printf("Your first gf was %s", getName());
	}
}
