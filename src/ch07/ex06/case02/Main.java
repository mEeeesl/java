package ch07.ex06.case02;

public class Main {
	public static void main(String[] args) {
		Life alien = new Life();
		Life alien1 = new Alien();
		Alien alien2 = new Alien();
		
		alien1.eat();
		alien2.eat(); 
		// static method - ����� �ȵǱ⿡, @Override �Ұ�
		System.out.println(" - - - - ");
		
		alien.shout();
		alien1.shout();
		alien2.shout();
		System.out.println(" - - - - ");
		
		// Class.method(); - �̷��� ���°� Best��
		Life.eat(); 	
		Alien.eat();
		//Life.shout(); - static method�� class.method(); ����
	}
}
// @Override �ϸ�, �ڽ��� method�� ����.