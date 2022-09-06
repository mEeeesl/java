package ch07.ex05.case10;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Bumblebee bumblebee = new Bumblebee();
		Prime prime = new Prime();
		List<Autobot> corps = new ArrayList<>();
		
		corps.add(bumblebee);
		corps.add(prime);
		
		for(Autobot autobot: corps) {
			autobot.run();
			autobot.fight();
			//autobot.guard(); - Error 

			if(autobot instanceof Bumblebee)((Bumblebee)autobot).guard();
			if(autobot instanceof Prime)((Prime)autobot).command();
		// autobot 객체가 범블비 Class의 인스턴스라면 캐스팅 후 범블비가 가드해라.
		// autobot 객체가 프라임 Class의 인스턴스라면 캐스팅 후 프라임이 지휘하라.
		}
	}
}
