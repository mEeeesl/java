package ch06.ex04.case01;

public class Cat extends Animal {
	//public Cat() {} �� �����ڴ� �⺻������ �ڵ� �����Ǵµ� �갡 ������
		// �׷��� public class >Cat< �갡 �����Ͽ��������
		// �ذ����� superȣ�⹮ - �θ��� �����ڸ� ȣ��
		// �θ��� �����ڿ��� �Ȱ��� ��������ߴ�  
		
		private int age;
		
		public Cat(String name, int age) {
		  //super();
			super(name); 	
		// �θ�Animal�� name���� �װ� �ڽ�Cat�� �޾� name���� 

		//	this.name = name; - Error] private 
			this.age = age;	//	Cat class�� age
		}
		
		public int getAge() {
			return this.age;
		}
}
//this. = �� , super = �θ�