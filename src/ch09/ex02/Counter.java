package ch09.ex02;

public class Counter implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ": start.");
		
		for(char c = 'a'; c <= 'f'; c++) {
			System.out.println(Thread.currentThread().getName() + ": " + c);
			try {
				System.out.println(Thread.currentThread().getName() + ": sleep.");
				Thread.sleep(1000);
			} catch (InterruptedException e��) {
				System.out.println(Thread.currentThread().getName() + ": end. �� ���ع޾Ƽ� �پ�");
			}
		}
			
		System.out.println(Thread.currentThread().getName() + ": end.");
	}
}

/*
Runnable ���� run�̶�� method 1���� �ִ�.
Thread implements Runnable �̱⿡
run�� �ִٴ°� Thread�� �ִٴ� ��
currentThread() -> Thread�� ȣ���� Thread�� ���� �� ����




*/