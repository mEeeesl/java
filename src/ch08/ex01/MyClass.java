package ch08.ex01;
//@Field Error

@Universal
@Type(name="class", value=1)	// �Ӽ������� �߰������� �� ����.
public class MyClass {
	@Field(1) @Universal	// 1 - int value�� ��;  value = 1 ���� �ᵵ��
	private String name;
	
	@Constructor	//	default = 0; �̱⶧�� ���⼭ 0�̵�. ���������ص��Ǳ���
	public MyClass() {
		
	}
	
	@Method
	public void play(@Param String name, @Param int age) {
		@Local int i = 0;
	}
}
