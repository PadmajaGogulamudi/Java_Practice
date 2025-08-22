package oops.interfaces;

public class CreditCard implements Payment{

	@Override
	public void payBill(double amount) {
System.out.println("payment of "+amount+" done through CreditCard!!!");		
	}

}
