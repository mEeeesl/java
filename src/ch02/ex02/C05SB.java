package ch02.ex02;

public class C05SB {
	public static void main(String[] args) {
		StringBuffer src = new StringBuffer("�츮 ���� ");
		
		int len = src.length();
		System.out.println("length: " + len);
		
		/* StringBuffer !!!
		 * ���⼱ ���� �������� �ʰ� src �� ��ü�� �ٲپ� �����°���.
		 * �Ʊ� concat�� return�߾�����, ���⼱ src ��ü�� ���� ¢�´ٷ� �ٲ����.
		 * src ��ü�� ���� ����̷� �ٲپ������,
		 * 
		   �޸� ���� �������ش�. 
		   �ٵ� �� �� ���δ� ��	�����صδ�	*/
		src.append("¢�´�.");  
		src.replace(3, 4, "�����");
		
		String str = src.toString();
		
		System.out.println(src);	//	StringBuffer Type
		System.out.println(str);	//	String Type
	}
}
