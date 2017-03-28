package tut_47;

public class apples {

	public static void main(String[] args) {
		tuna member1 = new tuna("Megan","Fox");
		tuna member2 = new tuna("Nelly","Portman");
		tuna member3 = new tuna("Taylor","Swift");
		
		System.out.println();
		System.out.println(member3.getFirst());
		System.out.println(member2.getLast());
		System.out.println(member1.getLast());		
		/*
		// We could access the STATIC Variable like this:
		System.out.println(member1.getMembers()+"\n");
		// But it is better to directly address that class!!!
		*/
		
		// ### For STATIC Variables we DON'T have to ADDRESS the object
		// ### We can JUST INVOKE that CLASS METHOD to get that VARIABLE
		System.out.println(tuna.getMembers());
		// ### We have to invoke a method that returns the variable!!!
		// ### (we cannot address the variable directly)
	}

}
