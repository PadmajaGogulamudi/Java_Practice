package lab;

public class King {
	Float earnings=new Float(27000);
	Float pf=new Float(5);
	Float cgst=new Float(7);
	Float da=new Float(3);
	 {
		Float salary=(earnings*12);
		Float pf1=(salary*pf)/100;
		Float cgst1=(salary*cgst)/100;
		Float da1=(salary*da)/100;
		
		Float finalSal=salary-pf1-cgst1+da1;
		System.out.println("Total Salary : "+finalSal);
		
	}

	public static void main(String[] args) {
	new King();
		

	}

}
