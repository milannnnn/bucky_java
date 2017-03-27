package tut_15;

import java.util.Scanner;

public class apples {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		tuna tunaObject = new tuna();
		System.out.println("Enter ur name:");
		String temp = input.nextLine();		
		
		tunaObject.simpleMessage(temp);
		
		input.close();
		
	}

}
