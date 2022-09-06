package ch09.ex04;

public class Buffer {
	private Integer val;
	
	public synchronized int remove() {
		while(val == null) {
			try {
				wait(); // Object에 wait() 있어서 Error 안남
			} catch(InterruptedException e) {}
		}
		
		int val = this.val;
		//과제] 꺼냇다.를 표현하세요.
		this.val = null;
		
		notifyAll(); // 모든 Thread 깨우기, 일어 난 놈이 락걸고 머하고 함
		
		return val;
	}
	
	public synchronized void add(Integer val ) {
		while(this.val != null) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		
		this.val = val;
		notifyAll(); 	//모든 Thread 깨우는거 다 일어나, 일어난 놈이 락걸고 머하고 함
	}
}
// Buffer - 완충지대, 임시저장소
// synchronized - 동기화