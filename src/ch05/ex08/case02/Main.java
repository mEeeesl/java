package ch05.ex08.case02;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		User user = new User("미미", 29, LocalDate.now());
		
		User user2 = new User();
		user2 = new User();
		user2.setName("디디");
		user2.setAge(36);
		user2.setRegDate(LocalDate.now());
		
		
		System.out.printf("%s %d %s\n", 
				user.getName(), user.getAge(), user.getRegDate());
		System.out.printf("%s %d %s\n", 
				user2.getName(), user2.getAge(), user2.getRegDate());
		
	}
}
