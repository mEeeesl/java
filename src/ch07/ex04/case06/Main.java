package ch07.ex04.case06;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		animals[0] = new Cat("헤롱이");	//promotion
		animals[1] = new Dog("왈왈이");	
		animals[2] = new Dog("성큼이");
		
		//iterating ( Animal로 읽어야 고양이 강아지 다 얻음 )
		for(Animal animal: animals)
			System.out.println(animal);
		
		Object[] objs = new Object[3];
		
		objs[0] = new Cat("이롱헤");	//Cat이 promotion - object 됨
		objs[1] = new Dog("이왈왈");
		objs[2] = new Dog("이큼성");
		
		for(Object obj: objs)
			System.out.println(obj);
	}
}
/* ' generic type ' 탄생배경
 	Animal타입이아닌, Animal타입이 들어갈 수 있는 배열 객체를 만드는거니까 가능
 	Object로 해버리면 엉뚱한 객체들이 올 수 있기때문에 안쓴다고 함.
 	다양한 객체는 어케 받아그럼? => ' generic type '
 	객체를 생성하는 시점에는 그 객체의 타입이 생기기때문에 걱정 NoNo라고 함
*/