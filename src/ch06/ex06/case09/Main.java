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

		//chrome.in(); - Error 객체.in() 불가 - interface역할
		chrome.out();
		chrome.play(); // class에 있는건 객체.play() 가능 - 권장하진않음
		Chrome.play(); // 쓸순 있는데 유지보수할때 힘들어서 안 쓰는게나음
		browser.play();// 이것도 쓸수 있긴한데 
		Browser.play();// 이게 그나마 Best. Browser class에 있는 메소드니까
		
		
	}
}
// instance method - Class.method