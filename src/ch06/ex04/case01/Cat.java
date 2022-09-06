package ch06.ex04.case01;

public class Cat extends Animal {
	//public Cat() {} 이 생성자는 기본적으로 자동 생성되는데 얘가 에러임
		// 그래서 public class >Cat< 얘가 컴파일에러가뜬거
		// 해결방법은 super호출문 - 부모의 생성자를 호출
		// 부모의 생성자에도 똑같이 셋팅해줘야댐  
		
		private int age;
		
		public Cat(String name, int age) {
		  //super();
			super(name); 	
		// 부모Animal이 name쓰면 그걸 자식Cat이 받아 name적용 

		//	this.name = name; - Error] private 
			this.age = age;	//	Cat class의 age
		}
		
		public int getAge() {
			return this.age;
		}
}
//this. = 나 , super = 부모