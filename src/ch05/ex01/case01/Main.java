package ch05.ex01.case01;

public class Main {
	public static void main(String[] args) {
		int hour = 12;
		int minute = 35;
		int second = 30;
		System.out.printf("%d시 %d분 %d초\n", hour, minute, second);
		
	//Class명 참조변수명 = new Class명();
		Time time = new Time();
		time.hour = 12;
		time.minute = 35;
		time.second = 30;
		time.mimi = 526;
		System.out.printf("%d시 %d분 %d초 %dmimiBirDay\n", time.hour, time.minute, time.second, time.mimi);
		
	//Class내에 정의된 멤버변수가 아닌 참조변수를 쓰면 안됨? 
	//ex) time.susu = 2; 이건 에러임 
	//왜냐면 Class내 멤버변수는 ( hour, minute, second, mimi )만 해놨기 때문에 이것만 쓸 수 있음?
		
		Time time2 = new Time();
		time2.hour = 10;
		time2.minute = 30;
		time2.second = 27;
		time2.mimi = 94;
		System.out.printf("%d시 %d분 %d초 %dmimiBirYear\n", time2.hour, time2.minute, time2.second, time2.mimi);
		
		System.out.println(time);  // time의 주소값 > ch05.ex01.case01.Time@233c0b17
		System.out.println(time2.toString()); // time2의 주소값 > ch05.ex01.case01.Time@63d4e2ba
									// println에 객체가 들어오면 toString해줌 자동으로
	// 객체 . toString Time2 객체의 클래스이름 풀네임 at Hashcode 를 하나의 String코드로 만들어서 return하고 출력함
	// time 과 time2의 타입이 Time 타입으로 같구나 hour minute second mimi가 있겠구나 같은 time 클래스니까
	// 근데 주소값은 다르다 해시코드가 있으니까. 
		
	}
}