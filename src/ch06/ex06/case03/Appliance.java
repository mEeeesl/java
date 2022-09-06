package ch06.ex06.case03;

public interface Appliance {
	void on();
	void off();
}
/*	class 는 public void on (){} 이거 써야댐
	interface는 확장성이 높아서 void on(); 이거만 쓰면댐
	자식 class가 어떤걸 써야되는지 강제할 수 있다.
*/

/*	extends 는 domain?에 첨부터 public void on() {} 이거까지 정의하지만,
	implements 하면 domain?에 void on()만 쓰는대신,
	@Override로 Body {}를 강제로 만들어야함
	확장성을 확보하고자 쓰는거임.
	이거 자주쓴다함 interface - implements 
*/

/*	body가 있는 method = 일반 method
 * 	body가 없는 method = 추상 method
 */

/*	interface 
 * 1. 추상메소드		- body가 없는 method
 * 2. default 메소드	- body를 넣을 수 있는 method
 * 3. static 메소드	- body를 넣을 수 있는 method
 */