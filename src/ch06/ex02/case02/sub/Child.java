package ch06.ex02.case02.sub;

import ch06.ex02.case02.Parent;

public class Child extends Parent {
	public void Play() {
		
		// this.getRegNum();	// private
		this.getName();			// public
		this.getMoney(); 		// protected - 다른 패키지지만, 자식은 상속
		//this.addMoney(1000);	// default - 다른 패키지면 X
	}
}
