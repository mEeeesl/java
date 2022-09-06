package ch07.ex06.case06;

public class Cabinet <T extends A>{ // A class를 갖고있는 class로 한정 
									// A 이하 타입
									// A를 부모 Class로 두는 class
									// A, B class
	public T getLastVal(T[] arr) {
		return arr[arr.length - 1];
	}
	
	public <S extends C> S getFinalVal(S[] arr) {
		return arr[arr.length - 1];
	}
}
/* generic type은 제약이 없어 모두 받아들일수 있지만, 
 * 유한한 집합으로 만들 수도 있음
 * 
 * 제너릭 메소드에도 extends 쓸 수 있
 */