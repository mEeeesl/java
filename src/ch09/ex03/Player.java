package ch09.ex03;

public class Player extends Thread {
	private Counter counter;	//player has a Counter
	
	public Player(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			counter.increase();
			counter.decrease();
			
			if(i % 10 == 0) counter.print();
			
			try {	//내가 갖고 있는 method니까 Thread라고 안써도됨?
				sleep((int)(Math.random() * 2));
			} catch(InterruptedException eㅎ) {}
		}	
	}
}
