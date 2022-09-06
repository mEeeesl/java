package ch07.ex06.case07;

import java.util.List;

public class Pocket {
	{	//instance 블럭
		int i = 1 * 2;
		double d = 1.0 * 2.0;
		i = new Integer(1) + new Integer(2); // AutoBoxing
		d = new Double(1.0) + new Double(2.0); // 작대기는 곧 사라진다는 거
		
		//new Number(1) + new Number(2); Number = abstract 추상class라 new () 불가
	}
	
	// unbounded wildcard = 와일드카드 무제한
	// wildcard = 사용한 시점에도 여전히 제너릭 타입으로 냅두고 싶어
	// class를 디자인하는데 제너릭 타입을 여전히 제너릭으로 냅두고 싶어
	// wildcard 는 ?로 되어 있음 
	// 뭐가 와도 다 되게
	public void printList(List<?> list) {
		System.out.println(list);
	}
	
	// upper bounded wildcard 상한선 ( A 이하 = A가 상한선 )
	public double add(List<? extends Number> list) {// number 이하 = double까진 되는데 string은 안됨 
		double sum = 0;
		for(Number n: list) sum += n.doubleValue();	
		//Number로 해줘야 머가 들어오든 promotion이 가능, Integer썻다간 나중에 double로 내가 정하면 에러
		
		return sum;
	}
	
	// lower bounded wildcard 하한선 ( A 이상 = ?는 부모가 옴 )
	public List<? super Integer> add2(List<? super Integer> list){
		return list;
	}
}
//남이 이미 제너릭 만들어 놨는데,
//나만의 메소드를 만들때 그 때도 제너릭타입 유지시키는법