package ch05.ex01.case03;

public class Main {
	public static void main(String[] args) {
		/*
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		
		user1.name = "���Ѽ�";
		user1.age = 12;
		System.out.println(user1.name + " " + user1.age);
		
		user2.name = "�ѾƸ�";
		user2.age = 22;
		System.out.println(user2.name + " " + user2.age);
		
		user3.setName("�ηη�");
		user3.setAge(32);
		
		System.out.println(user3.name + " " + user3.age);
		
		user3.setName("HoHoHo");
		
		System.out.printf("%s, %d\n", user3.getName(), user3.getAge());
		
		user3.name = "�鿹��";
		System.out.printf("%s, %d\n", user3.getName(), user3.getAge());
		*/
		
		User user = new User();
		user.setName("��ȿ��");
		user.setAge(12);
		
		System.out.printf("%s, %d\n", user.getName(), user.getAge());
		
		user.setName("�鿹��");
		
		System.out.printf("%s, %d\n", user.getName(), user.getAge());
	}
}
