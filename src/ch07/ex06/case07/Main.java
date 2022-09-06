package ch07.ex06.case07;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Pocket pocket = new Pocket();
		List<Number> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Double> list3 = new ArrayList<>();
		List<String> list4 = new ArrayList<>();
		
		list1.add(1); list1.add(2);	// promotion - int - Integer - Number
		list2.add(1); list2.add(2);	// 1, 2 = Integer type
		list3.add(1.0); list3.add(2.0);
		list4.add("a"); list4.add("b");
		
		pocket.printList(list1);	// printList - wildcard <?> - 무한
		pocket.printList(list2);
		pocket.printList(list3);
		pocket.printList(list4);
		
		System.out.printf("%.1f\n%.1f\n%.1f",
				pocket.add(list1), 	// add - Number 이하
				pocket.add(list2), 
				pocket.add(list3));
				//pocket.add(list4); Error - String
		
		pocket.add2(list1);	// add2 - Integer 이상
		pocket.add2(list2);
		//pocket.add2(list3); 
		//pocket.add2(list4);
		
		
	}
}
// 	와일드카드 안써도 개발은 가능. 좀 편하게 가능할 뿐임 겁 ㄴㄴ
/* 	남이 이미 제너릭 만들어 놨는데,
 	나만의 메소드를 만들때 그 때도 제너릭타입 유지시키는법

	lambda 람다 = 함수인데 함수라고 따로 명시하지 않고, 
				 코드 한줄에 함수를 써서 그것을 호출하는 방식이다.
				 굳이 안써도 되니까 너무 겁 ㄴㄴ 개념만큼은 알고가자(프론트영역)
*/