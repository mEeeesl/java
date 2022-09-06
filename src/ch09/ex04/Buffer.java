package ch09.ex04;

public class Buffer {
	private Integer val;
	
	public synchronized int remove() {
		while(val == null) {
			try {
				wait(); // Object�� wait() �־ Error �ȳ�
			} catch(InterruptedException e) {}
		}
		
		int val = this.val;
		//����] ������.�� ǥ���ϼ���.
		this.val = null;
		
		notifyAll(); // ��� Thread �����, �Ͼ� �� ���� ���ɰ� ���ϰ� ��
		
		return val;
	}
	
	public synchronized void add(Integer val ) {
		while(this.val != null) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		
		this.val = val;
		notifyAll(); 	//��� Thread ����°� �� �Ͼ, �Ͼ ���� ���ɰ� ���ϰ� ��
	}
}
// Buffer - ��������, �ӽ������
// synchronized - ����ȭ