package ch08.ex04;

import java.util.logging.Logger;

public class C01MyLogger {
	public static void main(String[] args) {
		Logger.getGlobal().info("hello");	
		
	}
}

//Global.() >app 자체가 갖고있는 타입이 만들어짐
// info 더해주면 알림해줌 ? 
// 팩토리 메소드로 로거 얻어내고 로고점 객체점 인포 하면은 저 메세지가 출력이됨
// 로거는 이 메시지 뿐만아니라 일, 시간, 어디서 찍었는지 출처까지 찎음
// 메세지 수준까지도 나옴 ( 지금수준 - 정보 )
// 로거가 되려면 최소 2가지 정보가 있어야댐
// 일/시간 + 메시지 
// info 메소드가 이미 다 구현 되있음.
