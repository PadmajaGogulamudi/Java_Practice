package CaseStudy;

import java.util.Scanner;

class InvalidAmountException extends Exception {
	InvalidAmountException(String msg) {
		super(msg);
	}
}

class InsufficientBalanceException extends Exception {
	InsufficientBalanceException(String msg) {
		super(msg);
	}
}

public class Account {
	long accNo = 68977362;
	String name = "Abc Reddy";
	double balance;

	public boolean deposit(double amount) throws InvalidAmountException {
		if (amount > 0) {
			balance += amount;
			return true;
		} else {
			throw new InvalidAmountException("amount should me greaterthan 0,try again !!");
		}

	}

	public boolean withdraw(double amount) throws InsufficientBalanceException {
		if (amount <= this.balance) {
			balance -= amount;
			return true;
		} else {
			throw new InsufficientBalanceException("Insufficient Amount!!");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account a = new Account();
		do {
			try {
				System.out.println("Hello , " + a.name + "\n1.deposit\n2.withdraw\nselect the services :");
				int n=sc.nextInt();
				System.out.print("enter amount : ");
				double amount=sc.nextDouble();
				switch (n) {
				case 1 -> {
					if (a.deposit(amount))
						System.out.println("success deposit, available balance : " + a.balance);

				}
				case 2 -> {
					if (a.withdraw(amount))
						System.out.println("success withdraw, available balance : " + a.balance);

				}
				default->{
					System.out.println("invalid selection!! try again");
					continue; 
				}
				}

			} catch (InvalidAmountException e) {
				System.err.println(e.getMessage());
			} catch (InsufficientBalanceException e) {
				System.err.println(e.getMessage());
			}
			System.out.println("want to proceed..[y/n]:");

		} while (sc.next().equalsIgnoreCase("y"));
		sc.close();

	}

}
