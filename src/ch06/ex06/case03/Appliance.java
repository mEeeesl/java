package ch06.ex06.case03;

public interface Appliance {
	void on();
	void off();
}
/*	class �� public void on (){} �̰� ��ߴ�
	interface�� Ȯ�强�� ���Ƽ� void on(); �̰Ÿ� �����
	�ڽ� class�� ��� ��ߵǴ��� ������ �� �ִ�.
*/

/*	extends �� domain?�� ÷���� public void on() {} �̰ű��� ����������,
	implements �ϸ� domain?�� void on()�� ���´��,
	@Override�� Body {}�� ������ ��������
	Ȯ�强�� Ȯ���ϰ��� ���°���.
	�̰� ���־����� interface - implements 
*/

/*	body�� �ִ� method = �Ϲ� method
 * 	body�� ���� method = �߻� method
 */

/*	interface 
 * 1. �߻�޼ҵ�		- body�� ���� method
 * 2. default �޼ҵ�	- body�� ���� �� �ִ� method
 * 3. static �޼ҵ�	- body�� ���� �� �ִ� method
 */