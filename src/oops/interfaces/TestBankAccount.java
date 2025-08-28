package oops.interfaces;

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount savingsAccount=new savingsAccount(52312,100);
		BankAccount CurrentAccount=new CurrentAccount(12345,200);
		savingsAccount.calculateIntrest();
		savingsAccount.deposit(200);
		savingsAccount.withdraw(100);
		
		//savingsAccount.withdraw(1000000);
		
		System.out.println("---------------------");
		CurrentAccount.calculateIntrest();
		CurrentAccount.deposit(700);
		CurrentAccount.withdraw(200);
		//CurrentAccount.withdraw(1000);
		
		
		
		
		
		
	}

}
