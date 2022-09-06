package ch02.ex01;

public class C02Output {
	public static void main(String[] args) {
		int score = 100;
		System.out.println(100);
		System.out.println(score);
		System.out.println(100+1);
		System.out.println(Math.random()); //0.0이상 1.0이하
		
		System.out.print(200);
		System.out.print(300);
		System.out.print("\n");
		System.out.print(400);
		System.out.print("\n");
		System.out.printf("%b %c %d %f %s\n", false, 'a', 10, 1.15, "hello" ); //앞에는 출력양식을 스트링으로, 뒤는 아무형식
		// 과제] 위 출역문에서 구분자로 /를 사용하세요.
		System.out.printf("%b/%c/%d/%f/%s\n", true, 'a', 10, 1.15, "hello" );
		System.out.printf("%5b|%-5c|%5d|%5.2f|%5s\n", true, 'a', 10, 1.15, "hello");
		System.out.printf("%5b|%-5c|%5d|%.2f|%5s\n", true, 'a', 10, 1.15, "hello");
		
		String name = "최한석";
		int age = 22;
		System.out.printf("%s %d\n", name, age);
		System.out.printf("%s은 %d살입니다.", name, age);
		System.out.println();
		System.out.println(name + "은 " + age + "살입니다.");
	}
}
