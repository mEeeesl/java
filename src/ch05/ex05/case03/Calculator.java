package ch05.ex05.case03;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	// 		 �� returnŸ�� (��ü�� data, int double�� data)
	public Paper add(Paper paper) {
		paper.setResult(paper.getA() + paper.getB());
		return paper;	// paper�� �ּҰ��� ������
		// �����ؼ� paper = calculator.add(paper); ����
		//          �� �̸��� ��,  
		//��ü , Ŭ������ ����Ÿ�ϱ� ���ϰ��� �����ͷ� ���� = return = paper
	
	}
}
