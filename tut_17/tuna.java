package tut_17;

public class tuna {
	// Private Variables can only be ACCESSED DIRECTLY within it's class
	// Not FROM OUTSIDE (unless we define a special method for that) 
	
	private String girlName;
	
	public tuna(String name){
		girlName = name;
	}
	public tuna(){}
	
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
