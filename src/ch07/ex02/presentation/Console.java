package ch07.ex02.presentation;

public interface Console {
	static void info(Object obj) {	//어떤 객체든 받겠다 Object로 promotion되서  
		System.out.println(obj);
	}
}
