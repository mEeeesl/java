package ch02.ex02;

public class C05SB {
	public static void main(String[] args) {
		StringBuffer src = new StringBuffer("우리 개는 ");
		
		int len = src.length();
		System.out.println("length: " + len);
		
		/* StringBuffer !!!
		 * 여기선 따로 저장하지 않고 src 값 자체를 바꾸어 버리는거임.
		 * 아깐 concat을 return했었지만, 여기선 src 자체를 개는 짖는다로 바꿔버림.
		 * src 자체의 개를 고양이로 바꾸어버리고,
		 * 
		   메모리 낭비를 방지해준다. 
		   근데 잘 안 쓰인다 함	기억못해두댐	*/
		src.append("짖는다.");  
		src.replace(3, 4, "고양이");
		
		String str = src.toString();
		
		System.out.println(src);	//	StringBuffer Type
		System.out.println(str);	//	String Type
	}
}
