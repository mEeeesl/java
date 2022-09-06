package ch05.ex01.case03;
// 빈 줄 우클릭 > source -> generate Getter and Setter -> 
// -> name, age check! -> generate 클릭 ! 붐 !

// private 멤버변수 + public getter & setter 를 만든다.

public class User {
	private String name;
	private int age;
	
	// getter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
 
	
	
	// String name;	// heap에 생김 - 객체라서
	// int age;
	
	//getter 와 setter
	//리턴값이 없다 = void
	//리턴값이 있다 = 리턴값의 타입
	//method 이름은 동사로 쓰기 (행동을나타냄)
	// 		method 선언부
	
	/*
	//	setter
	public void setName(String name) {
		this.name = name;	// this. 안쓰면 stack에 생김 - method 내에 있기에 
							//그래서 this.써조야댐 멤버변수로 할당하기위해
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	//	getter
	//	new = 객체 만들다 return = 리턴값을 나타냄
	public String getName() {
		return this.name;	// this.name말고 name 해도 되긴 된다고하는듯
	}

	public int getAge() {
		return this.age;
	}
	*/
}
	