package ch07.ex06.case08;

import java.util.ArrayList;
import java.util.List;

public class Ship {
	//Ship has main container
	// 이미 존재하는 클래스가 제너릭이고 사용하기전까지 제너릭으로 하고싶으면 wildcard 사용
	private List<Container<?>> containers;
	
	public Ship() {
		containers = new ArrayList<>();
	}
	
	public void put(Container<?> container) {
		containers.add(container);
	}
}
