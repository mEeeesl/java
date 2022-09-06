package ch07.ex02.domain;

public class User {
	private String name;
	
	public User(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
/*	domain -> dao -> service -> presentation
	
	domain 먼저작업. data가 필요하니까 + DTO (어디든 돌아댕김)
 	
 	persistence layer 	- Dao		= 체계적인 data를 모아 DB에 저장
 	service layer		- Service
 	presentation layer	- Io
 	
 	3계층으로 나누는 이유
	> 여기 dao에서는 배열을 씀
	> 나중에 기술배우면 dao에서 DB를 이용 
	> Code 달라짐
	> 서비스 계층은 안건들이고
	> 퍼시스트 계층만 건들이면됨

*/