package ch09.ex02;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + ": start.");
		
		Thread counter = new Thread(new Counter());
		counter.start();
		
		int tries = 1;
		while(counter.isAlive()) { // counter가 살아있으면 true가 리턴, 죽으면(a~f입력되면) false되고 while블럭 탈출
			if(tries <= 2) {
				counter.join(1000);	// 메인쓰레드이 counter를 1초간 조인(결합하기,바라보기,기다리기) , 그 1초간 메인은 쉼, 그 후 메인이 일함
				System.out.println(Thread.currentThread().getName() + ": wait " + tries++);
			} else {
				System.out.println(Thread.currentThread().getName() + ": irritated 기다리다 화났음.");
				counter.interrupt(); // counter 자고있을때 깨워버리기 메인은 기다리고 있는데 임마 자고있으면 서터레스
				counter.join(); // 시간 안정해둠 - counter가 죽을때까지 기다림 
			}
		}
		
		System.out.println(Thread.currentThread().getName() + ": end.");
	}
}


// Thread는 Runnable 타입의 값을 받는다.
// Counter() 는 내가 방금 implements Runnable 해놈.
// .join(1000) - 메인쓰레드가 counter를 1초간 조인(결합하기,바라보기,기다리기) 
// 그 1초간 메인은 쉼, 그 후 메인이 일함