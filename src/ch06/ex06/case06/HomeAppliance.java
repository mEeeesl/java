package ch06.ex06.case06;

import ch06.ex06.case03.Appliance;
import ch06.ex06.case05.Electronic;

public interface HomeAppliance extends Appliance, Electronic{

}

/*
	자식이 interface인 경우엔, extends로 인터페이스를 여러개 받을 수 있음
	
*/