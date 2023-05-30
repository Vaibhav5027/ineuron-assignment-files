package in.ineuron.bank_user;

public class BankAccount {
	private String name;
	private String accountNumber;
	private double balance;
	private String password;
	public BankAccount(String name, String accountNumber, double i, String password) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = i;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
