package ch08.ex02.case003;

public class Main {
	public static void main(String[] args) {
		String name = Way.LEFT.name();
		int ordinal = Way.LEFT.ordinal();// code��
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
			//System.out.print(way.toString() + " "); �� ���� ��
		System.out.println("\n");
		
		Way way = Way.valueOf("LEFT");
		System.out.println(way);	//toString() ���� ȣ���Ѱ�.
		
	}
}
// Way[] = WayŸ���� ��ü���� �迭
// ���⼭ ȣ��Ǵ� way�� toString�� ȣ���ϴ°�
// System.out.print(way.toString() + " "); �� ���� ��