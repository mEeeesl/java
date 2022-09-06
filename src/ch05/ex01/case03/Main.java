package ch05.ex01.case03;

public class Main {
	public static void main(String[] args) {
		/*
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		
		user1.name = "최한석";
		user1.age = 12;
		System.out.println(user1.name + " " + user1.age);
		
		user2.name = "한아름";
		user2.age = 22;
		System.out.println(user2.name + " " + user2.age);
		
		user3.setName("로로로");
		user3.setAge(32);
		
		System.out.println(user3.name + " " + user3.age);
		
		user3.setName("HoHoHo");
		
		System.out.printf("%s, %d\n", user3.getName(), user3.getAge());
		
		user3.name = "백예린";
		System.out.printf("%s, %d\n", user3.getName(), user3.getAge());
		*/
		
		User user = new User();
		user.setName("한효주");
		user.setAge(12);
		
		System.out.printf("%s, %d\n", user.getName(), user.getAge());
		
		user.setName("백예린");
		
		System.out.printf("%s, %d\n", user.getName(), user.getAge());
	}
}
