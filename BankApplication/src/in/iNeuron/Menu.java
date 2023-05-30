package in.iNeuron;

import java.util.Scanner;

import in.iNeuron.operations.Operations;

public class Menu {

	public static void main(String[] args) {
		int choice = 0;
		boolean verifyUser = false;
		Operations op = new Operations();

		System.out.println("\t\t\t Welcome to Bank");
		System.out.println("\t\t\tEnter user accountnumber and password to login");
		Login login = new Login();
		verifyUser = login.verifyUser();

//		System.out.println("\t\t\t select 1 for login ");

		if (verifyUser) {
			System.out.println("\t\t\t select 2 for check balance");
			System.out.println("\t\t\t select 3 for deposite money");
			System.out.println("\t\t\t select 4 for widraw money");
			System.out.println("\t\t\t Press Any Key To Exits");

			Scanner sc = new Scanner(System.in);
			System.out.print("\t\t\t please Enter choice::");
			choice = sc.nextInt();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			switch (choice) {
			case 2:
				op.checkBalance();
				break;

			case 3:
				System.out.print("\t\t\t Enter the Amount to deposite::");
				double amount = sc.nextDouble();
				op.depositeMoney(amount);
				break;

			case 4:
				System.out.print("\t\t\t Enter the Amount to deposite ");
				double amount1 = sc.nextDouble();
				op.widrawMoney(amount1);
				break;
			default:
				System.out.println("\t\t\t Transaction Ended");
				System.exit(0);
				break;
			}

		} else {
			System.out.println("\t\t\t Your entered wrong credentials");
			System.exit(0);
		}
	}
}
