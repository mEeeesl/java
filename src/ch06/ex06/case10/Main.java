package ch06.ex06.case10;

public class Main {
	public static void main(String[] args) {
		BusCard card = new BusCard() {
			@Override
			public void tagOn() {
				System.out.println("tag On.");
			}
			
			
			@Override
			public void tagOff() {
				System.out.println("tag Off.");
			}
		};
		
		card.tagOn();
		card.tagOff();
	}
}
/*	interface에서도 객체를 만들 수 있는( new Class(); ) 방법이있다.
 *	new BusCard(){ };
 *  버스카드 인터페이스를 상속받은 이름없는 어떤 클래스가 있는데, 
 *  이름없는 이 클래스의 블럭을 생성하는것이다.
 *	익명 클래스는 버스카드 인터페이스를 상속받은것만 남는다.
 *	그래서 이 블럭에는 @Override 해주면된다. 	
 * 	얘는 클래스 블럭 끝에 ; 붙여줘야댄다.
 * 	
 * 	이런 이름없는 클래스는 단순 1회용에 그치므로, 많이 쓰지 않는다.
 *  이벤트 같은거 할때나 쓰인다한다.
 * 	android 개발자는 쓴다고 하는데 우리는 딱히 안써도 된다함.
 * 	
 * 	
 * 	
 * 	
 */