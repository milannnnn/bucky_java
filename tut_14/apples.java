package tut_14;

public class apples {

	public static void main(String[] args) {
		
		// If we want to use a method from another class
		// we have to create an OBJECT of USED CLASS!!!!!
		// ALLOWS US TO USE ALL THE STUFF FROM THAT CLASS
		tuna tunaObject = new tuna();
		
		// To use the method we call the object with dot separator
		tunaObject.simpleMessage();
		
	}
}
