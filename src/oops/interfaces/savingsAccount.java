package oops.interfaces;

public class savingsAccount extends BankAccount {
	savingsAccount(long accountNumber, double banalce) {
		super(accountNumber, banalce);
	}

	static double intrest;

	@Override
	void calculateIntrest() {
		intrest=super.getBalance()*0.5;
		System.out.println("intrest from savingsAccount : "+intrest);


	}

}
