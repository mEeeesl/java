package ch05.ex05.case03;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int result = calculator.add(1, 2);
		System.out.println(result);
		
		Paper paper = new Paper();
		paper.setA(2);
		paper.setB(3);
		paper = calculator.add(paper);	//���Ϲ޴� Ÿ���� paper��
		System.out.println(paper.getResult());
		
		//Paper paper2 = calculator.add(paper);
		//�̰Ŵ� paper = calculate.add(paper); �� �ƹ� ����� ���� �����̷�
		//����� ���⿡ Paper paper2�� ���� paper�� 2���� �ֱ��� ���� ���ذ����ܼ�
		//�Ⱦ��°ŷ�;;
		
	}
}
