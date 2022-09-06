package ch05.ex05.case03;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	// 		 ▼ return타입 (객체도 data, int double도 data)
	public Paper add(Paper paper) {
		paper.setResult(paper.getA() + paper.getB());
		return paper;	// paper의 주소값을 리턴함
		// 리턴해서 paper = calculator.add(paper); 에서
		//          ▲ 이리로 감,  
		//객체 , 클래스는 데이타니까 리턴값도 데이터로 받음 = return = paper
	
	}
}
