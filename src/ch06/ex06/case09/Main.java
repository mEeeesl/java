package ch06.ex06.case09;

public class Main {
	public static void main(String[] args) {
		Console console = new Console();
		Browser browser = new Browser();
		
		console.out();
		browser.out();
		
		UI.in();
		
		System.out.println();
		Chrome chrome = new Chrome();

		//chrome.in(); - Error ��ü.in() �Ұ� - interface����
		chrome.out();
		chrome.play(); // class�� �ִ°� ��ü.play() ���� - ������������
		Chrome.play(); // ���� �ִµ� ���������Ҷ� ���� �� ���°Գ���
		browser.play();// �̰͵� ���� �ֱ��ѵ� 
		Browser.play();// �̰� �׳��� Best. Browser class�� �ִ� �޼ҵ�ϱ�
		
		
	}
}
// instance method - Class.method