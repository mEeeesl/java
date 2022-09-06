package ch03.ex07;

public class C02StrCompare {
	public static void main(String[] args) {
		boolean b = false;
		String s = "a";
		
		b = s == "a";	// true - "a"는 상수로 저장됨
		
		s = new String("a");
		b = s =="a";	// false - s는 하나의 Class기에 완전 같지는 않음 (?)
		
		b = s.equals("a");	// true - 문자값 비교는 equals API 활용
		
		System.out.println(b);
		
		/* 			"" String 으로 만드는 방법
			1.  "";
			    -> String s = "mimi";
			   
			   ==> System.out.print(s);
			    -> "mimi"
			    
			2.	new String("");
				-> String s = new String("mimi");
				
			   ==> system.out.print(s); 
			    -> "mimi"
			    
			3.  s.equals(""); ''문자 데이터값이 같은지 확인법'', 타입은 다를 수 있음
				 -> String s = "mimi" 
				 
				==> system.out.print(s); 
				 -> "mimi" 
				 -> s.equlas("mimi")	*/
	}
}
