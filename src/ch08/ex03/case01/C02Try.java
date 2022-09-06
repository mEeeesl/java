package ch08.ex03.case01;

public class C02Try {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		try {
			int result = arr[10];
		} catch (ArrayIndexOutOfBoundsException eㅎㅎ) {
			System.out.println("예외가 발생했습니다. arr[] 10이하로 숫자넣으세여");
		}
		
		
		System.out.println("끝.");
	}
}
/*
개발자가 도저히 논리적으로 해결 못할 때
try { } catch (){} 쓰는거.

try code를 안 쓸 수 있으면 좋은 코드래

ArrayIndexOutOfBoundsException 쓰지말고
현장에서는 Exception < 이것만 씀 가장 큰 범위의 부모

*/