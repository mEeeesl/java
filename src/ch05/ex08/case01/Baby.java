package ch05.ex08.case01;

public class Baby {
	private String name;

	public Baby() {} // 이게 여태 자동으로 생성 되었었음.
	
	public Baby(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
