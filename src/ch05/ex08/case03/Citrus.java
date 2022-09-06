package ch05.ex08.case03;

public class Citrus {
	private String name;
	
	public Citrus() {
		//new Citrus("한라봉");
		//this.name = "천혜향"; 이렇게쓰면 안좋대
		this.name = name;
	}
	
	public Citrus(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
