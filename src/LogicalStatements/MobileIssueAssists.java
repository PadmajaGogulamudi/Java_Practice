package LogicalStatements;

import java.util.Scanner;

public class MobileIssueAssists {
	static Scanner sc = new Scanner(System.in);
	static String yes = "yes";
	static String no = "no";
	String ans;

	void handleBatteryIssues() {
		System.out.println("is your mobile over heated : ");
		ans = sc.next();
		if (ans.equalsIgnoreCase(yes)) {
			System.out.println("change the battery ");

		} else
			System.out.println("sell the mobile ");

		System.out.println("is your problem solved : ");
		ans = sc.next();
		if (ans.equalsIgnoreCase(yes)) {
			exit();
		} else
			handleBatteryIssues();

	}

	void handleNetworkIssues() {
		System.out.println("is your mobile not getting signals : ");
		ans = sc.next();
		if (ans.equalsIgnoreCase(yes)) {
			System.out.println("once take out the sim card and put in ");

		}

		System.out.println("is your problem not  solved : ");
		ans = sc.next();
		if (ans.equalsIgnoreCase(yes)) {
			System.out.println("once turn on flight mode  ");
		}
		System.out.println("is your problem solved : ");
		if (ans.equalsIgnoreCase(yes)) {
			exit();
		} else
			handleNetworkIssues();
	}

	void handleAppCrashIssues() {
		System.out.println("is your mobile Struck: ");
		ans = sc.next();
		if (ans.equalsIgnoreCase(yes)) {
			System.out.println("once restart the mobile ");

		} else
			System.out.println("once update the mobile software ");

		System.out.println("is your problem solved : ");
		ans = sc.next();

		if (ans.equalsIgnoreCase(yes)) {
			exit();
		} else
			handleAppCrashIssues();

	}

	void handleStorageIssues() {
		System.out.println("is your mobile out of memory: ");
		ans = sc.next();
		if (ans.equalsIgnoreCase(yes)) {
			System.out.println("on backup ");

		} else
			System.out.println("once update the mobile software ");
		System.out.println("is your problem solved : ");
		ans = sc.next();

		if (ans.equalsIgnoreCase(yes)) {
			exit();
		} else
			handleStorageIssues();

	}

	void exit() {
		System.out.println("**********Thanks for using Vcube services**********");

	}

	public static void main(String[] args) {
		MobileIssueAssists m1 = new MobileIssueAssists();
		System.out.println("**********Welcome to vcube service center**********");
		System.out.println(
				"select any service\n1.Battery Issues\n2.Network Issues\n3.App Crash Issues\n4.Storage Issues");
		int i = sc.nextInt();
		switch (i) {
		case 1:
			m1.handleBatteryIssues();
			break;
		case 2:
			m1.handleNetworkIssues();
			break;
		case 3:
			m1.handleAppCrashIssues();
			break;
		case 4:
			m1.handleStorageIssues();
			break;
		default:
			System.out.println("select 1 to 4 services only");

		}

	}

}
