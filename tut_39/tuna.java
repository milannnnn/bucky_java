package tut_39;

public class tuna {
	int hour;
	int minute;
	int second;
	
	// ### This - Recursive Constructor ### 
	// Looks for the constructor with the same number of arguments
	// as this (eg. this(x,y,z) will look for const. with 3 args.)
	// and the passes it the arguments given to this
	
	public tuna(){
		this(0,0,0);
	}
	
	public tuna(int h){
		this(h,0,0);
	}

	public tuna(int h, int m){
		this(h,m,0);
	}
	
	public tuna(int h, int m, int s){
		//this(h,m,s);
		setTime(h,m,s);
	}

	public void setTime(int h, int m, int s){
//		setHour(h);
//		setMinute(m);
//		setSecond(s);
		hour   = h;
		minute = m;
		second = s;
	}
	
}
