package ch07.ex06.case05;

public class Main {
	public static void main(String[] args) {
		Box box = new Box();
		
		Integer[] arr1 = {1, 2, 3};
		String[] arr2 = {"a", "b", "c"};
		
		int i = box.getLastVal(arr1);
		String s = box.getLastVal(arr2);
		
		System.out.printf("%d, %s",i, s);
	}
}
/* generic type은 제약이 없어 모두 올 수있지만, 
 * 유한한 집합으로 만들 수도 있음 -> 다음 case에서
 */