package tut_46;

public class tuna {
	private String first; // first name
	private String last;  //  last name
	private static int members = 0; // Static - every object share the same variable!!!
	                                // IF we CHANGE in ONE variable it WILL CHANGE in ALL OTHERS!!!
	
	public tuna(String fn, String ln){
		first = fn;
		last  = ln;
		members++;
		System.out.printf("Constructor for %s %s, members in da club %d\n",first, last, members);
	}
}
