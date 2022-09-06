package ch09.ex01;

public class C01Counter {
	public static void main(String[] args) {
		System.out.println("main start.");
		
		Thread thread1 = new Thread(() -> {
			for(int i = 0; i < 10; i++)
				System.out.print(i + " ");
		});
		
		Thread thread2 = new Thread(() -> {
			for(char c = 'a'; c <= 'z'; c++)
				System.out.print(c + " ");
		});
		
		thread1.start();
		thread2.start();
		//thread1, 2�� ���� ����, 0 a b 1 2 3 4 c 5 d e 6 f g h 7 8 i j z l m n o 0 p ~
		//VM�� �ú����� �ڱ� ������� �ؼ� �׷���
		
		System.out.println("main end.");
			
	}
}
/*
���� �����带 �ٷ����� ���� ����
WAS ( Web Application Server ) ���⼭ �˾Ƽ� ������ �����Ű�⶧����
���� WAS ȸ�翡 ���� �ʴ��̻� ���� �����带 �ڵ��� ���� ���� ������  

Thread
.start();

main start
main end
0 1 2 3 4 5 6 7 8 9 �� ��µ� => start ������ �����°� �ƴ϶� ���߿�����

process 
��ü�� ���� ��ü, �ڱ⸸�� ������ ������ ����, �� ���� ������ ��� ���� ó����.

ex) �츮 ���� �������ó�� - process
ex) �Ĵ� - �丮��, ����, ĳ��, �� �ϳ��ϳ��� Thread��

���ݱ����� ���������� �������� - ������(sequence) ����

������ Ŭ������ �̿��ؼ� ������ 2�� �̻� �����غ�����

���⼱ Main Thread��, thread1, thread2�� ����

Main Thread�� �ϴ��� = ���� �����ϰ� ������ ��ü�� ����. �׸��� ��ŸƮ ȣ��( �����Ű�°Ǿƴ� ) �׸��� ���� end ���� ����
�����彺ŸƮ �Ǹ� Thread1, Thread2�� �����

thread1, 2�� �ϴ� �� = 0 ~ 9, a ~ y 


*/