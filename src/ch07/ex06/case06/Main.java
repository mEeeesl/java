package ch07.ex06.case06;

public class Main {
	public static void main(String[] args) {
		Cabinet<A> cabinet1 = new Cabinet<>();
		Cabinet<B> cabinet2 = new Cabinet<>();
		// Cabinet<C> cabinet; - Error A 이하 타입에 C는 속해지 않음.
		
		A[] arr1 = {new A(), new A()};
		B[] arr2 = {new B(), new B()};
		C[] arr3 = {new C(), new C()};
		D[] arr4 = {new D(), new D()};
		
		// ▼ T부분
		cabinet1.getLastVal(arr1);	// A 본인 가능
		cabinet1.getLastVal(arr2);	// A 이하인 B 가능 - promotion B>A 
		cabinet2.getLastVal(arr2);	// B 본인 가능
		//cabinet2.getLastVal(arr1); Error
		
		/* ▼ S부분
		cabinet1.getFinalVal(arr1); // Error - C 이하만 가능
		cabinet1.getFinalVal(arr2); // A, B 모두 C 이하가 아님 */
		cabinet1.getFinalVal(arr3);	// C 본인 가능
		cabinet1.getFinalVal(arr4); // C 이하인 D 가능
		
		/* 디자인할때 말고 이용할 때 쓰고싶을 때, method 콜 할때 쓰고싶을 때
		   이미 존재하는 클래스를, 사용하는 시점에 결정할 때
		
		   남이 이미 제너릭 만들어 놨는데,
		   나만의 메소드를 만들때 그 때도 제너릭타입 유지시키는법 - 다음 case 
		*/ 
	}
}
