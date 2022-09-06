package ch05.ex09.case02;

public class Main {
	public static void main(String[] args) {
		Phone phone1 = new Phone();		//100
		Phone phone2 = new Phone();		//200	
		Phone phone3 = new Phone(1000);	//1000	
		Phone phone4 = new Phone();		//400
		
		System.out.printf("%d, %d, %d, %d", 
				phone1.getSerial(), phone2.getSerial(),
				phone3.getSerial(), phone4.getSerial());
		
		
	}
}
