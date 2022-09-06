package ch07.ex04.case01;

public class Array {
	public static void main(String[] args) {
		String[] strs = new String[3];
		System.out.println(strs);
		
		Integer[] integers = new Integer[3];
		System.out.println(integers);
		
		int[] ints = new int[3];
		System.out.println(ints);
										// 0부터시작.
		System.out.printf("%d %d %d\n", ints[0], ints[1], ints[2]);
		// = 0, 자동 초기화되는걸 보니 객체고 heap에 생김
		System.out.printf("%d %d %d\n", integers[0], integers[1], integers[2]);
		System.out.printf("%s %s %s\n", strs[0], strs[1], strs[2]);
		// = null, class 타입의 기본값
		
		//변수에다가 데이터를 넣어서 사용
		ints[0] = 0;
		ints[1] = 1;
		ints[2] = 2;
		System.out.printf("%d %d %d\n", ints[0], ints[1], ints[2]);
		// = 0 1 2 
		
		for(int i = 0; i < ints.length; i++) ints[i] = i;
		
		for(int i = 0; i < ints.length; i++)
			System.out.print(ints[i] + " ");
		
		System.out.println("\n");
		
		//iterating(배열)
		//int i- 원소를 담을변수 , ints - collection
		//for each라고 부른다.
		for(int i: ints) System.out.print(i + " ");
		
		//이것들은 잘안씀 위에를 많이쓴다함 
		int[] array = {0, 1, 2};
		array = new int[] {0, 1, 2};
	}
}
/* 배열을 보단 ★List를 주로 쓸 거기는 함. 일단 배워가자 정도 느낌
 * String 문자 [] 배열
 * String[] = 문자열을 배열로 사용하겠다. 
 * String data를 n개 담을 수 있는 배열 타입
 * strs는 그걸 담을 변수 ( args는 변수명이라서 args가 아니어도 상관없 )
 * 
 * 객체니까 new로 
 * new dataType length
 * new String[3] => String 타입을 받을 수 있는 배열객체 3개를 만듬 
 * 
 * 데이터타입[] 변수 = new 데이터타입[length]
 * 
 * Integer = wrapper class라 부름
 * int 조차도 클래스로(객체로) 만들고싶어서 사용 
 * 
 * 일반객체에서는 일일이 다 선언해줘야함
 * 배열객체에서는 알아서 다 생성됨 ints[0] strs[1] 이런거처럼
 * 
 * 일반객체에서는 data type이 제각각
 * 배열객체에서는 data type이 하나로 통일
 * 
 * iterating = 배열 
 * */
