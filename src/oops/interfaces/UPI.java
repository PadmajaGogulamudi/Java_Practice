package oops.interfaces;

public class UPI implements Payment{
	@Override
	public void payBill(double amount) {
System.out.println("payment of "+amount+" done through UPI!!!");		
	}


}
