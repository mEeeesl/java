package ch08.ex03.case02;

public class Main {
	public static void main(String[] args) {
		String userId = "hello";
		
		try {
			if(userId.length() > 3)
				throw new LengthException("ID ���̰� �ʰ��Ǿ����ϴ�."); // try�� ����߸� ����
		} catch (LengthException e����) {
			e����.printStackTrace();
		}
		
		throw new NumberException("���ڰ� �ƴմϴ�."); // try�� �ȹ�� ����
	}
}
//ID���̸� 3���ڷ� ����
//��� > NumverException�� ���