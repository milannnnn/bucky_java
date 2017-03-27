package tut_07;

import java.util.Scanner;

public class apples {

	public static void main(String[] args) {
		Scanner bucky = new Scanner(System.in);
		
		//double fnum;
		//double snum;
		double fnum, snum, answer;
		
		System.out.println("Enter first num: ");
		fnum = bucky.nextDouble();
		
		System.out.println("Enter second num: ");
		snum = bucky.nextDouble();
		
		bucky.close();
		
		answer = fnum+snum;
		
		System.out.println("The sum of 2 numbers is " + answer);
		
	}

}
