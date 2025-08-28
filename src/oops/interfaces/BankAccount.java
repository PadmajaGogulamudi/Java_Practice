package oops.interfaces;

public abstract class BankAccount {
	private long accountNumber;
	private double banalce;
	
	BankAccount(long accountNumber,double banalce){
		this.accountNumber=accountNumber;
		this.banalce=banalce;
	}

	abstract void calculateIntrest();

	double getBalance() {
		return this.banalce;
	}

	void setbalance(double amount) {
		this.banalce = amount;
	}

	void deposit(double amount) {
		this.setbalance(this.getBalance() + amount);
		System.out.println("Current Balance Available : "+this.getBalance());
	}

	void withdraw(double amount) {
		
		if (this.getBalance() >= amount)
			this.setbalance(this.getBalance() - amount);
		else
			System.out.println("insufficient balance!!");
		System.out.println("Current Balance Available : "+this.getBalance());

	}

}
