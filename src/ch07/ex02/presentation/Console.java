package ch07.ex02.presentation;

public interface Console {
	static void info(Object obj) {	//� ��ü�� �ްڴ� Object�� promotion�Ǽ�  
		System.out.println(obj);
	}
}
