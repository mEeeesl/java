package ch08.ex04;

import java.util.logging.Level;
import java.util.logging.Logger;

public class C02MyLogger {
	private Logger logger;
	
	public C02MyLogger() {
		this.logger =Logger.getLogger("ch08.ex04"); 
	}
	
	public void log() {
		logger.info("로깅을 시작합니다.");
		
		try {
			throw new Exception("일부로 예외를 만들었습니다.");
		} catch (Exception e) {
			logger.log(Level.SEVERE, e.getMessage());
		}
		
		logger.info("로깅을 끝냅니다.");
	}
	
	public static void main(String[] args) {
		new C02MyLogger().log();
	}
}
/*

아까는 로거객체 만들었을땐 로고 겟글로벌
지금은 Logger.getLogger("")
파라미터 => 지금 사용하고 있는 객체(Class)의 패키지명

보통 로거는 exception 발생했을때 일 함

info , err 등 여러가지 method가 있는데
다 포함하는건 logger.log 
단, 첫번째 파라미터로 level을 넣어주면댐
Level.SEVERE  - 심각한수준

콘솔에 출력되는 로거의 한계 및 단점
-> 앱이 종료가 되면 로거는 사라짐

이 걸 극복하는건 콘솔이 아니라 파일에다가 쳐 넣는거임.


*/