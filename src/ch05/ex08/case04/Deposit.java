package ch05.ex08.case04;

public class Deposit {
	private int balance;
	
	public Deposit() {
		//this.balance = 1000; //- hard coding 이라 안좋음
		this(1000);
	}
	
	public Deposit(int principal) {
		//this.balance = principal; // principal + 0; 으로 보면 밑에랑 중복
		this(principal, 0);
	}
	
	public Deposit(int principal, int interest) {
		this.balance = principal + interest + 100;
	}
	
	public int getBalance() {
		return this.balance;
		//return balance; 이것도 가능함
	}
}
