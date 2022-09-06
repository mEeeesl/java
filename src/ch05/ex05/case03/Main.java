package ch05.ex05.case03;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int result = calculator.add(1, 2);
		System.out.println(result);
		
		Paper paper = new Paper();
		paper.setA(2);
		paper.setB(3);
		paper = calculator.add(paper);	//리턴받는 타입이 paper임
		System.out.println(paper.getResult());
		
		//Paper paper2 = calculator.add(paper);
		//이거는 paper = calculate.add(paper); 랑 아무 상관이 없데 정상이래
		//사람이 보기에 Paper paper2를 보면 paper가 2개가 있구나 싶은 오해가생겨서
		//안쓰는거래;;
		
	}
}
