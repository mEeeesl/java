package ch07.ex05.case07;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	public static void main(String[] args) {
		Map<Integer, User> map = new HashMap<>();
		
		map.put(1, new User("���Ѽ�"));
		map.put(2, new User("�ѾƸ�"));
		map.put(3, new User("�����"));
		System.out.println(map);
		
		User user = map.get(1);	// .get(key)
		System.out.println(user);
		System.out.println(map);
		
		// key�� �����ϰ� ����¹�
		user = map.remove(1);
		System.out.println(user);
	 	System.out.println(map);
		
	}
}
/*
Map�� Ű�� ����� ���� �����ؾ��� 
Map�� �Ķ���� 2�� ���� , Map < Key, Value > 
AutoBoxing�Ǽ� ���� ������. 


*/