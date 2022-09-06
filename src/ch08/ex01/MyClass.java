package ch08.ex01;
//@Field Error

@Universal
@Type(name="class", value=1)	// 속성값까지 추가시켜줄 수 있음.
public class MyClass {
	@Field(1) @Universal	// 1 - int value의 값;  value = 1 으로 써도됨
	private String name;
	
	@Constructor	//	default = 0; 이기때메 여기서 0이됨. 따로지정해도되긴함
	public MyClass() {
		
	}
	
	@Method
	public void play(@Param String name, @Param int age) {
		@Local int i = 0;
	}
}
