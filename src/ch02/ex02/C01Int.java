package ch02.ex02;

public class C01Int {
	public static void main(String[] args) {
		//int = integer ���� //  decimal = ����, 10����
		
		int x = 10; 	// decimal - 10������ ��Ÿ��
		System.out.println(Integer.toBinaryString(x)); // �Է¹��� parameter�� 2������ string���� ��Ÿ��
		
		x = 0b1010; 	// binary - 2������ ��Ÿ�� -- 0b
		System.out.println(Integer.toBinaryString(x));
		
		x = 012;  		// octal - 8������ ��Ÿ��  -- 0
		System.out.println(Integer.toBinaryString(x));
		
		x = 0xA;  		// hexa - 16������ ��Ÿ��  -- 0x
		System.out.println(Integer.toBinaryString(x)); 
		
		
		x = 1_234_567; 	// �������� ����, õ ������ ������ ���ͷ��� ' _ ' UnderBar ��밡��
		System.out.println(x + 1);  	// ���ڶ� ���ϱ� ������
		
		double y = 1e1; // 10�� 1����
		System.out.println(y);
	}
}
