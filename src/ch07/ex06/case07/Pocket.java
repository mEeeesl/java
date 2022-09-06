package ch07.ex06.case07;

import java.util.List;

public class Pocket {
	{	//instance ��
		int i = 1 * 2;
		double d = 1.0 * 2.0;
		i = new Integer(1) + new Integer(2); // AutoBoxing
		d = new Double(1.0) + new Double(2.0); // �۴��� �� ������ٴ� ��
		
		//new Number(1) + new Number(2); Number = abstract �߻�class�� new () �Ұ�
	}
	
	// unbounded wildcard = ���ϵ�ī�� ������
	// wildcard = ����� �������� ������ ���ʸ� Ÿ������ ���ΰ� �;�
	// class�� �������ϴµ� ���ʸ� Ÿ���� ������ ���ʸ����� ���ΰ� �;�
	// wildcard �� ?�� �Ǿ� ���� 
	// ���� �͵� �� �ǰ�
	public void printList(List<?> list) {
		System.out.println(list);
	}
	
	// upper bounded wildcard ���Ѽ� ( A ���� = A�� ���Ѽ� )
	public double add(List<? extends Number> list) {// number ���� = double���� �Ǵµ� string�� �ȵ� 
		double sum = 0;
		for(Number n: list) sum += n.doubleValue();	
		//Number�� ����� �Ӱ� ������ promotion�� ����, Integer���ٰ� ���߿� double�� ���� ���ϸ� ����
		
		return sum;
	}
	
	// lower bounded wildcard ���Ѽ� ( A �̻� = ?�� �θ� �� )
	public List<? super Integer> add2(List<? super Integer> list){
		return list;
	}
}
//���� �̹� ���ʸ� ����� ���µ�,
//������ �޼ҵ带 ���鶧 �� ���� ���ʸ�Ÿ�� ������Ű�¹�