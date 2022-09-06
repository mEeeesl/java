package ch09.ex02;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + ": start.");
		
		Thread counter = new Thread(new Counter());
		counter.start();
		
		int tries = 1;
		while(counter.isAlive()) { // counter�� ��������� true�� ����, ������(a~f�ԷµǸ�) false�ǰ� while�� Ż��
			if(tries <= 2) {
				counter.join(1000);	// ���ξ������� counter�� 1�ʰ� ����(�����ϱ�,�ٶ󺸱�,��ٸ���) , �� 1�ʰ� ������ ��, �� �� ������ ����
				System.out.println(Thread.currentThread().getName() + ": wait " + tries++);
			} else {
				System.out.println(Thread.currentThread().getName() + ": irritated ��ٸ��� ȭ����.");
				counter.interrupt(); // counter �ڰ������� ���������� ������ ��ٸ��� �ִµ� �Ӹ� �ڰ������� ���ͷ���
				counter.join(); // �ð� �����ص� - counter�� ���������� ��ٸ� 
			}
		}
		
		System.out.println(Thread.currentThread().getName() + ": end.");
	}
}


// Thread�� Runnable Ÿ���� ���� �޴´�.
// Counter() �� ���� ��� implements Runnable �س�.
// .join(1000) - ���ξ����尡 counter�� 1�ʰ� ����(�����ϱ�,�ٶ󺸱�,��ٸ���) 
// �� 1�ʰ� ������ ��, �� �� ������ ����