package ch08.ex02.case01;

public class Main {
	public static void main(String[] args) {
		Day day = Day.MONDAY;	// enum class가 data type
		
		String dayName = "";
		switch(day) {
		case MONDAY: dayName = "월요일"; break;
		case TUESDAY: dayName = "화요일";
		}
		
		System.out.println(dayName);
	}
}
