package ch08.ex02.case003;

public class Main {
	public static void main(String[] args) {
		String name = Way.LEFT.name();
		int ordinal = Way.LEFT.ordinal();// code값
		System.out.printf("%s %d\n", name, ordinal);
		
		name = Way.RIGHT.name();
		ordinal = Way.RIGHT.ordinal();
		System.out.printf("%s %d\n", name, ordinal);
		
		name = Way.UP.name();
		ordinal = Way.UP.ordinal();
		System.out.printf("%s %d\n", name, ordinal);
		
		Way[] ways = Way.values();
		for(Way way: ways) 
			System.out.print(way + " ");
			//System.out.print(way.toString() + " "); 와 같은 꼴
		System.out.println("\n");
		
		Way way = Way.valueOf("LEFT");
		System.out.println(way);	//toString() 으로 호출한것.
		
	}
}
// Way[] = Way타입의 객체들의 배열
// 여기서 호출되는 way는 toString을 호출하는것
// System.out.print(way.toString() + " "); 와 같은 꼴