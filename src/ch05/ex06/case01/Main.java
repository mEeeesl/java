package ch05.ex06.case01;

public class Main {
	public static void main(String[] args) {
		Man.say("I love java."); // static method�� ����
		//Man.tell("I love java."); static method �ƴ϶� �Ұ���
		
		Man man = new Man();
		man.tell("I love java.");
		
		man.say("Hello"); // ������ instance �޽����� �ְ��� ���ɼ��� �ֱ⿡
	}
}
