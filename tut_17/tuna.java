package tut_17;

public class tuna {
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
