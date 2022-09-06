package ch06.ex06.case05;

import java.time.LocalDate;

public interface Electronic {
	public static final int VOLTAGE = 200;
	static final String MAKER_NAME = "LG";
	final int WEIGHT = 10;
	LocalDate PRODUCED_DATA = LocalDate.now();
	
	public abstract void displayMsg();
	abstract int getTemperature();
	String getModelName();
	
}
/*	interface�� ĸ��ȭ private ���ϰ� public �ع���
 	interface�� public static final + abstract�� �ʼ���
 	interface�� �����ڰ� ������ ���⿡, �������𹮿��� �ʱⰪ�� �ۼ� �ؾߴ�
 	���� public�̴� static�̴� �Ƚᵵ, public static final ������
 	abstract �Ƚᵵ abstract ������
 	
 	������� ���������� �����Ҷ� ������������ �������̽��� �־ߴ�
 	final�� �����ߴ�
 */
