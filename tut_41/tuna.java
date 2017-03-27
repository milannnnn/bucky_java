package tut_41;

public class tuna {
	private int hour;
	private int minute;
	private int second;
	
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
		setHour(h);
		setMinute(m);
		setSecond(s);
	}
	
	public void setHour(int h){
		hour = ((h>=0&&h<24)?h:0);
	}
	public void setMinute(int m){
		minute = ((m>=0&&m<60)?m:0);
	}
	public void setSecond(int s){
		second = ((s>=0&&s<60)?s:0);
	}

	public int getHour(){
		return hour;
	}
	public int getMinute(){
		return minute;
	}
	public int getSecond(){
		return second;
	}
	
	public String toMilitary(){
		return String.format("%02d:%02d:%02d",getHour(),getMinute(),getSecond());
	}
}
