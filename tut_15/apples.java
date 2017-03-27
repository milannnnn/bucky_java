package tut_15;

import java.util.Scanner;

public class apples {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// We made an object to use the method from class tuna
		tuna tunaObject = new tuna();
		
		System.out.println("Enter name here:");
		String name = input.nextLine();
		
		tunaObject.simpleMessage(name);
		input.close();
	}

}
