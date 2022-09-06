package ch05.ex08.case04;

public class Main {
	public static void main(String[] args) {
		Deposit deposit = new Deposit();
		System.out.println(deposit.getBalance());
		
		deposit = new Deposit(2000);
		System.out.println(deposit.getBalance());
		
		deposit = new Deposit(4000, 3000);
		System.out.println(deposit.getBalance());
	}
}
