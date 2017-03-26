package tut_8;

//import java.util.Scanner;

public class apples {
	public static void main(String[] args) {
		//Scanner bucky = new Scanner(System.in);		
		
		int girls, boys, people1, people2;
		double people3, people4;
		girls = 11;
		boys  = 3;
		
		
		people1 = girls / boys;         // Division (of 2 int -> int division)
		people2 = girls % boys;         // Modulus
		people3 = girls / boys;         // Division (of 2 int -> int division -> double)
		people4 = (double)girls / boys; //
		
		System.out.println(people1);
		System.out.println(people2);
		System.out.println(people3);
		System.out.println(people4);
		
	}
}
