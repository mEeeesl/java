package ch05.ex05.case07;

public class Main {
	public static void main(String[] args) {
		Farmer farmer = new Farmer();
		Retailer retailer = new Retailer();
		//Apple apple = new Apple();
		
		retailer.sell(farmer.sell(1000));
	}
}
// ����� ������ Famer���װ��� Retailer���װ��� '���'��ü�� �����װ� 
// �̷��� ��ü�� �Դٸ� ���ٸ��ϴ°��� DTO��� �Ѵ�.
// Apple�� domain�� �������� �ƴ�.
/*
��ΰ� ������� > Farmer.sell
�ĸӰ� ������� ����ǥ����
������ڰ� �޾Ƽ� ����������� �װ��� 2��ް� ��
retailer.sell�� ���ϵǰ� ��
*/
