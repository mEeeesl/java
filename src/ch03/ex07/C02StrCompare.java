package ch03.ex07;

public class C02StrCompare {
	public static void main(String[] args) {
		boolean b = false;
		String s = "a";
		
		b = s == "a";	// true - "a"�� ����� �����
		
		s = new String("a");
		b = s =="a";	// false - s�� �ϳ��� Class�⿡ ���� ������ ���� (?)
		
		b = s.equals("a");	// true - ���ڰ� �񱳴� equals API Ȱ��
		
		System.out.println(b);
		
		/* 			"" String ���� ����� ���
			1.  "";
			    -> String s = "mimi";
			   
			   ==> System.out.print(s);
			    -> "mimi"
			    
			2.	new String("");
				-> String s = new String("mimi");
				
			   ==> system.out.print(s); 
			    -> "mimi"
			    
			3.  s.equals(""); ''���� �����Ͱ��� ������ Ȯ�ι�'', Ÿ���� �ٸ� �� ����
				 -> String s = "mimi" 
				 
				==> system.out.print(s); 
				 -> "mimi" 
				 -> s.equlas("mimi")	*/
	}
}
