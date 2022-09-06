package ch08.ex03.case01;

public class C06Throws {
	/*
	public void first() {
		this.second();
	}
	
	
	public void second() {
		try {
			this.third();
		} catch(Exception e) {}	
	}	// {} 실행하고 밑에 Main에 new ~.first(); 종료 후 끝 출력하러 감
	*/
	
	public void first() {
		try {
			this.second();
		} catch(Exception eㅎㅎ) {}
	}
							 // ▼ throws Exception 하면 위에처럼 second()에 try 강제로 써야함
	public void second() throws Exception {	
		this.third();
	}
	
	public void third() {
		int i = 3 / 0;
	}
	
	public static void main(String[] args) {
		new C06Throws().first();
		System.out.println("끝");
	}
}
//현장에서는 Exception 만 쓴다함 블럭도 비워놓고

// throw = 블럭 안에 둠
// throws = 블럭 밖에 둠