package in.ineuron;

import java.util.ArrayList;

import in.ineuron.bank_user.BankAccount;

public class TestApp {

	public static void main(String[] args) {
		
		ArrayList<BankAccount> list=new ArrayList<>();
		list.add(new BankAccount("Vaibhav", "BOI12365",5000000,"Vaibhav@123"));
		list.add(new BankAccount("Akshay", "BOI12366", 5000000,"Akshay@123"));
		list.add(new BankAccount("Arvind", "BOI12366", 5000000,"Aravind@123"));
	}
	

}
