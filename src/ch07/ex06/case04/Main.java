package ch07.ex06.case04;

public class Main {
	public static void main(String[] args) {
		Bowl<Integer> bowl1 = new Bowl<>();
		Bowl<String> bowl2 = new Bowl<>();
		
		bowl1.setVal(1);	//Auto Boxing
		bowl2.setVal("hello"); 	//Auto Boxing
		
		int i = bowl1.getVal();
		String s = bowl2.getVal();
		
		System.out.printf("%d, %s", i, s);
	}
}
// ���׸� Ÿ���� �޼��忡 ������ ���ʸ� �޼���