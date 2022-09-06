package ch07.ex05.case03;

import java.util.ArrayList;

public class MyList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);	//key = 0, value = 1
		list.add(2);	//1, 2, 3, 1 = int 지만, 
		list.add(3);	//AutoBoxing되서 Integer type이 되어 list에 담김
		list.add(1);	//key = 3, value = 1
		
		System.out.println(list);
		
		for(int i: list) System.out.println(i + " ");
			//	근데 여기서 int i 에 넣을때는 AutoBoxing되서 int로 바뀜?
		System.out.println(" - - - -");
		
		System.out.println(list.get(0)); //데이터 읽기, 읽고 남아있는 상태
		
		for(int i = 0; i < list.size(); i++)	//size는 legth라 보면됨 여기선 4임
			System.out.print(list.get(i) + " "); 
		System.out.println("\n - - - - ");
		
		//데이터를 리턴 후 삭제 하는법
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.remove(i) + " ");
		
		/*	remove(0) = 1 리턴 후 삭제 	> 	{1, 2, 3, 1} > {2, 3, 1}
		 * 	remove(1) = 3 리턴 후 삭제 	> 	{2, 3, 1} > {2, 1}
		 * 	remove(2) = list.size() = 2 >	 i == list.size() 조건식 종료
		 *	{2, 1}은 증발
		 * 	결과값 > 1, 3
		 */
		
		// 과제 ] remove() list의 모든 원소를 삭제하라.
		System.out.println("\n - - - - - ");
		
		/*
		int size = list.size();
		for(int i = 0; i < size; i++)
			list.remove(0);
		*/
		for(int i = list.size() - 1; i >=0; i--)
			list.remove(i);
		System.out.println(list);
		
		//	내가한거 ▼
		//for(int i = 3; i < list.size(); i--)
			//System.out.print(list.remove(i) + " ");
		
	}
}
//List = key + value
// animals[0] = 1;
//	     key    value