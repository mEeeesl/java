package ch07.ex05.case06;

import java.util.HashSet;
import java.util.Set;

public class MySet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(1);	// AutoBoxing 
		set.add(2);
		set.add(3);
		set.add(1);	// Compile Error X �׳� �˾Ƽ� ���ֹ��� �ߺ��Ǵϱ�. 
		
		System.out.println(set);
		
		
		//for(int x = 1; x <= 100; x++) {
			//set.add(x);
		//}
		
		// 1 ~ 100 �������� ���ڻ̾Ƽ� 100ĭ�� �迭�� �ֱ�
		
	}
}
/*
set = ����
Ư¡ - ���Ұ� �����ϴ�.
set.add ����

list - key�� �־ �ߺ�����
set	 - key�� ��� �ߺ��Ұ�





*/