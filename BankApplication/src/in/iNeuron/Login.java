package in.iNeuron;

import java.util.Scanner;

//we using dummy username and password and we work with only one user for now
public class Login {
	String account_number = "123456";
	String password = "1234";
	String ac; 
	String pw;

	public boolean verifyUser() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\t\t\t Enter user account number::");
		ac = sc.next();
		
		System.out.print("\t\t\tEnter your password ::");
		pw = sc.next();
		

		if (ac.equalsIgnoreCase(account_number) && pw.equalsIgnoreCase(password)) {
			System.out.println("\t\t\t User verified Succesfully");
			return true;
		}
		else
			return false;
	}
}
