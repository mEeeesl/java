package ch05.ex01.case02;

public class Main {
	public static void main(String[] args) {
		String name = "최한석";
		int age = 35;
		System.out.printf("%s은 %d살\n", name, age);
		
		User user = new User();
		user.name = "최한석이";
		user.age = 3355;
		System.out.println(user.name + "는 " + user.age + "살");
	}
}