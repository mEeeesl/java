package ch06.ex02.case01;
			//access identifier(접근제한자)
			//public(공개), private(비공개)
			//private < default < < protected < public scope size 순서
			//private랑 public 위주만 주로 쓴데, 나머진 잘 안쓴데 
public class A {
	// ▼ 객체, 클래스에 저장됨?
	private int a;
	int b;
	protected int c;
	public int d;
	
	// ▼ method area에 저장됨
	private void m1() {}
	void m2() {}
	protected void m3() {}
	public void m4() {}
}
