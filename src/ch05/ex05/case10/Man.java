package ch05.ex05.case10;
					//Man - S , wear - V , Pajamas pajamas - O
public class Man {
	public void strip() {}
	public void wash() {}
	public void wear(Pajamas pajamas) {}
	public void lie() {}
	
	public void sleep(Pajamas pajamas) {
		this.strip();	//this.는 생략가능
		this.wash();
		this.wear(pajamas);
		this.lie();
	}
}
