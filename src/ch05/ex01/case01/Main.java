package ch05.ex01.case01;

public class Main {
	public static void main(String[] args) {
		int hour = 12;
		int minute = 35;
		int second = 30;
		System.out.printf("%d�� %d�� %d��\n", hour, minute, second);
		
	//Class�� ���������� = new Class��();
		Time time = new Time();
		time.hour = 12;
		time.minute = 35;
		time.second = 30;
		time.mimi = 526;
		System.out.printf("%d�� %d�� %d�� %dmimiBirDay\n", time.hour, time.minute, time.second, time.mimi);
		
	//Class���� ���ǵ� ��������� �ƴ� ���������� ���� �ȵ�? 
	//ex) time.susu = 2; �̰� ������ 
	//�ֳĸ� Class�� ��������� ( hour, minute, second, mimi )�� �س��� ������ �̰͸� �� �� ����?
		
		Time time2 = new Time();
		time2.hour = 10;
		time2.minute = 30;
		time2.second = 27;
		time2.mimi = 94;
		System.out.printf("%d�� %d�� %d�� %dmimiBirYear\n", time2.hour, time2.minute, time2.second, time2.mimi);
		
		System.out.println(time);  // time�� �ּҰ� > ch05.ex01.case01.Time@233c0b17
		System.out.println(time2.toString()); // time2�� �ּҰ� > ch05.ex01.case01.Time@63d4e2ba
									// println�� ��ü�� ������ toString���� �ڵ�����
	// ��ü . toString Time2 ��ü�� Ŭ�����̸� Ǯ���� at Hashcode �� �ϳ��� String�ڵ�� ���� return�ϰ� �����
	// time �� time2�� Ÿ���� Time Ÿ������ ������ hour minute second mimi�� �ְڱ��� ���� time Ŭ�����ϱ�
	// �ٵ� �ּҰ��� �ٸ��� �ؽ��ڵ尡 �����ϱ�. 
		
	}
}