package ch08.ex03.case01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C03Try {
	public static void main(String[] args) {
		PrintWriter out = null;
		int[] arr = {1, 2, 3};
		
		try {
			out = new PrintWriter(new FileWriter("C:/DEV/a.txt"));
			
			for(int i: arr) out.println("arr[" + i + "]: " + arr[i]);
		} catch(ArrayIndexOutOfBoundsException e����) {
			out.println("�迭 ���ܰ� �߻��߽��ϴ�.");
		} catch(IOException e����) {
			System.out.println("IO ���� �߻��߽��ϴ�.����");
		} finally {
			if(out != null) out.close();	//out = ���ҽ���ü = close(); finally ���� ȣ���ؼ� ���������
		}
		
		System.out.println("��.");
	}
}
/* 	�����͸� ���Ͽ� ������ϰ� DB�� �����ϱ⶧����
	�̷��� �ִ� ~ ��� ������
	
	// ���忡���� Exception �� ������ ���� �������
	
 	������� ��ü��
 	try {} catch(){} �� ��������� ���� ����
 	
 	�ϴ� > out.println() �ȿ� arr[i-1] �� �ؾ� ������ �߻����� ����
 	
 	�ٵ� �� ������ �߻��߳ĸ� > catch �� �� �� �� ���������༭
 	
 	�ذ��� > catch(ArrayIndexOutOfBoundsException e����){} �߰�
 	
 	�迭 ���ܰ� �߻��߽��ϴ�. out ��ü���ٰ� �� ����.
 	
 	finally { } �ȿ� out.close(); 
 	-> C:/DEV/a.txt �ؽ�Ʈ ���� ������ 
 	���� �����ߵ� �����ߵ�ű⿡ �� �ְ� ����
 */
