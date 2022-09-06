package ch07.ex05.case06;

import java.util.HashSet;
import java.util.Set;

public class MySet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(1);	// AutoBoxing 
		set.add(2);
		set.add(3);
		set.add(1);	// Compile Error X 그냥 알아서 없애버림 중복되니까. 
		
		System.out.println(set);
		
		
		//for(int x = 1; x <= 100; x++) {
			//set.add(x);
		//}
		
		// 1 ~ 100 랜덤으로 숫자뽑아서 100칸에 배열에 넣기
		
	}
}
/*
set = 집합
특징 - 원소가 유일하다.
set.add 있음

list - key가 있어서 중복가능
set	 - key가 없어서 중복불가





*/