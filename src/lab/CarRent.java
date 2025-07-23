package lab;

//Check once


public class CarRent {
	{
		System.out.println("Block : ");
	}
	
	CarRent(){
		System.out.println("Constructor : ");
	}
	
		
	String getCompanyName() {
		return "bmw";
		
	}
	int getdayRent() {
		return 1500;
	}
	private int getInsu() {
		return 500;
	}

	
	public int getbaserentdays(int days) {
		
		return getdayRent()*days;
		
	}
	public int totalRent(int days) {
		return getbaserentdays(days)+getInsu();
	}

	public static void main(String[] args) {
		CarRent c1=new CarRent();
		int totalRent = c1.totalRent(2);
		System.out.println(totalRent);
		
		
		
	}
	
}
