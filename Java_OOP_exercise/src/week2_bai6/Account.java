package week2_bai6;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	final double RATE = 0.035;

	public Account(String name, long accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public Account() {

	}

	public Account(long accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;

	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getRATE() {
		return RATE;
	}

	public boolean deposit(double amount) {
		if(amount > 0) {
			balance = balance + amount;
			return true;
		}
		return false;
	}

	public boolean withdraw(double amount, double fee) {
		if(amount > 0 && (amount + fee) <= balance) {
			balance = balance -amount- amount*(fee/100);
			return true;
		}
		return false;
	}

	public void addInterest() {
		balance = balance + balance * RATE;
		System.out.println(balance);
	}

	public boolean stransfer(Account acc1, Account acc2, double amount) {
		if(acc1.balance > amount) {
			acc2.balance +=amount;
			acc1.balance = acc1.balance - amount;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {

		Locale local = new Locale("vi", "vn");
		NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
		String bl = formatter.format(balance);
		return String.format("%-5d %15s %20s",accountNumber, name, bl);
	}
}
