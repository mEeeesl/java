package ch05.ex09.case01;

public class Init {
	private static int s;
	private int i;
	
	// static (초기화)블럭
	//  ▼ 클래스가 로딩될 때 최초 1회만 실행됨
	static {
		Init.s = 1;		//s = 1;도 알아먹음 근데, 명확하게 Init.s = 1로
		//this.i = 3;	//this는 error됨 - 
		//method 파라미터 첫번쨰에 this가 있어서 쓸수있었는데, 지금은 없어서 못씀
		System.out.println("static{} 초기화 완룟");
	}
	
	// instance (초기화)블럭
	// ▼ 객체(instance)가 생성될때(= new가 실행될때), 생성자보다 먼저 실행됨
	
	{
		Init.s = 2;
		this.i = 4;
		System.out.println("{}");
	}
	
	// ▼ 생성자 블록 - call 당해야 실행됨
	public Init() {
		Init.s = 5;
		this.i = 6;
		System.out.println("Init()");
	}
	
	// ▼ 생성자 블록
	public Init(int i) {
		Init.s = 7;
		this.i = 8;
		System.out.println("Init(int)");
	}
}
