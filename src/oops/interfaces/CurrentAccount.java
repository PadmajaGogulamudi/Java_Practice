package oops.interfaces;

public class CurrentAccount extends BankAccount{
	CurrentAccount(long accountNumber, double banalce) {
		super(accountNumber, banalce);
	}

	 double intrest;

	@Override
	void calculateIntrest() {
		this.intrest=super.getBalance()*0.2;
		System.out.println("intrest from currentAccount : "+this.intrest);

	}

}
