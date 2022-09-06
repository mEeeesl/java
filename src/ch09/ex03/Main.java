package ch09.ex03;

public class Main {
	public static void main(String[] args) {
		Counter counter = new Counter();
		new Player(counter).start();
		new Player(counter).start(); // 2명이서 counter 공유해서 경쟁하기. (위험)
		new Player(counter).start(); // 3명이서 counter 공유해서 경쟁하기. (위험)
		
	}
}
/*
하나 공유해서 쓰면 위험한데.
이거 제거하는 방법은 => QUE (줄서기 - FIFO처럼) 
synchronized - 메소드를 호출하면 락 걸기 - 먼저 호출한 놈이 락 걸어버림




*/