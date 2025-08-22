package oops.interfaces;

public class PayPal implements Payment{
	@Override
	public void payBill(double amount) {
System.out.println("payment of "+amount+" done through PayPal!!!");		
	}


}
