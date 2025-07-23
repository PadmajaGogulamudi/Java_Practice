package lab;

import java.util.Scanner;

//18-7-2025
public class Employeeee {
	String EmpName;
	boolean hasAccessCard;
	boolean biometricMatch;
	boolean isBlocklisted;
	boolean doorHasPower;
	
	
	public Employeeee(String empName, boolean hasAccessCard, boolean biometricMatch, boolean isBlocklisted,
			boolean doorHasPower) {
		super();
		EmpName = empName;
		this.hasAccessCard = hasAccessCard;
		this.biometricMatch = biometricMatch;
		this.isBlocklisted = isBlocklisted;
		this.doorHasPower = doorHasPower;
	}
	boolean canAccess(){
		return (biometricMatch && hasAccessCard &&(!isBlocklisted) && doorHasPower) ;
		
	}
	void display() {
		System.out.println("emp name : "+EmpName+"\nhas AccessCard : "+hasAccessCard+"\nbiometricMatch : "+biometricMatch+"\nis Blocklisted : "+isBlocklisted+"\ndoorHasPower : "+doorHasPower);
		System.out.println("Allow Access : "+canAccess());
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter em name : ");
		String s=sc.next();
		System.out.println("has access card [true/false] : ");
		boolean b=sc.nextBoolean();
		System.out.println("Biometric matched [true/false] : ");
		boolean b1=sc.nextBoolean();
		System.out.println("is block listed [true/false] : ");
		boolean b2=sc.nextBoolean();
		System.out.println("has door power [true/false] : ");
		boolean b3=sc.nextBoolean();
		Employeeee e=new Employeeee(s,b,b1,b2,b3);
		e.display();
		
		
		

	}

}
