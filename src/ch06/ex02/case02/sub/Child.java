package ch06.ex02.case02.sub;

import ch06.ex02.case02.Parent;

public class Child extends Parent {
	public void Play() {
		
		// this.getRegNum();	// private
		this.getName();			// public
		this.getMoney(); 		// protected - �ٸ� ��Ű������, �ڽ��� ���
		//this.addMoney(1000);	// default - �ٸ� ��Ű���� X
	}
}
