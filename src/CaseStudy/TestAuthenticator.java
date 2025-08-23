package CaseStudy;

import java.util.Scanner;

public class TestAuthenticator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Authenticator d = new DatabaseAuthenticator();
		Authenticator l = new LDAPAuthenticator();
		System.out.println("enter user name :");
		String user = sc.next();
		System.out.println("enter password :");
		String password = sc.next();

		if (d.authenticate(user, password))
			System.out.println("DatabaseAuthenticator check successfull!!");
		else
			System.out.println("DatabaseAuthenticator check failed!!");
		if (l.authenticate(user, password))
			System.out.println("LDAPAuthenticator check successfull!!");
		else
			System.out.println("LDAPAuthenticator check failed!!");

		sc.close();

	}

}
