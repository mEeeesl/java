package ch08.ex04;

import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class C03FileLogger {
	private Logger logger;
	
	public C03FileLogger() {
		this.logger = Logger.getLogger(this.getClass().getName());
	}
	
	public void log() throws Exception {
		Handler handler = new FileHandler("c:/DEV/ch08.ex04.xml");
		logger.addHandler(handler);
		
		logger.info("로깅을 시작합니다.");
		logger.severe("예외가 발생헀습니다.");
		logger.info("로깅을 끝냅니다.");
		
		handler.flush();
		handler.close();
	}
	
	public static void main (String[] args) throws Exception {
		new C03FileLogger().log();
	}
}

/*

패키지명을 소프트코딩으로 바꿔보자
> 객체.getClass() > Class타입의 객체가 리턴됨 
거기에 .getName() 조지면 클래스 패키지명이 나옴

로거에 새로운 핸들러를 추가시켜주는거임 
그러면 이 로거에 여러가지 쓸수있대 ;;

로거가 파일 핸들러에 출력했어 그러면 메모리에 출력함
우리는 파일에 기록되는게 목적임.
handler.flush();
handler.close(); 핸들러 데이타 출력하고 사라짐

27번 new C03FileLogger().log(); 이거 에러남
왜? throws 때문에
log를 콜함 - try 블럭으로 묶어야 함
근데 try로 묶기 싫어
-> 메인으로 떠넘겨 버리자
public static void main (String[] args) throws Exception {}




*/