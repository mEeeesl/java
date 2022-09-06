package ch05.ex05.case04;

public class Dog {
	private String name;
	private String breed;
	
	// public int fight() {return 0;} 디자인먼저 하고 밑에처럼 실행해도됨
	//public void figh(){}
	
	public void eat() {} // 먹는 행위를 했을때 return 값은 없다고치자. 그래서 void
	public void shout() {} // 짖을때 소리가 나는지, 낯선사람이 오면짖는지 관심없다치자. void 

	// getter 없이 setter => 읽지않고 쓰기만 하겠다.
	// 개한테 이름을 물어볼 필요도 없다는 마인드.
	public void setName(String name) {
		this.name = name;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
}
