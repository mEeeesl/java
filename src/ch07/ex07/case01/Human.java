package ch07.ex07.case01;

@FunctionalInterface	// - 람다로 만들어주는거
public interface Human {
	void say();
	//void sell(); - 람다식되면 메소드는 1개만 가질 수 있음.
	
	//say() method = data로 볼거고 data type = Human으로 볼 거임.
}
// lambda - 개념만 알고가자 겁 ㄴㄴ 