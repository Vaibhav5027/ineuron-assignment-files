package in.iNeuron.operations;

import in.iNeuron.exceptions.BankException;

public class Operations {
//conside initial amount is 25000
	 double balance=25000;
	
	
	public void depositeMoney(double amt) {
		if(amt<0) {
			throw new BankException("\t\t\tInvalid Transacation");
		}
		else {
			balance=balance+amt;
			System.out.print("\t\t\t"+amt+" : added succesfully");
		}
	}
	
	
	public void widrawMoney(double amt) {
		if(amt>balance) {
			throw new BankException("Insufficent Balance !!");
		}
		else {
			balance=balance-amt;
			System.out.print("\t\t\t amount "+amt +" widraw succefully");
			
		}
	}
	
	public void checkBalance() {
		System.out.println("Your Current Available balance is ::"+balance);
	}
} 
