package ch08.ex02.case01;

public class Main {
	public static void main(String[] args) {
		Day day = Day.MONDAY;	// enum class�� data type
		
		String dayName = "";
		switch(day) {
		case MONDAY: dayName = "������"; break;
		case TUESDAY: dayName = "ȭ����";
		}
		
		System.out.println(dayName);
	}
}
