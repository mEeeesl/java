package ch07.ex05.case07;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	public static void main(String[] args) {
		Map<Integer, User> map = new HashMap<>();
		
		map.put(1, new User("최한석"));
		map.put(2, new User("한아름"));
		map.put(3, new User("양승일"));
		System.out.println(map);
		
		User user = map.get(1);	// .get(key)
		System.out.println(user);
		System.out.println(map);
		
		// key를 리턴하고 지우는법
		user = map.remove(1);
		System.out.println(user);
	 	System.out.println(map);
		
	}
}
/*
Map은 키와 밸류를 내가 지정해야함 
Map은 파라미터 2개 받음 , Map < Key, Value > 
AutoBoxing되서 값이 들어갈거임. 


*/