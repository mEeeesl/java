package ch07.home.ex04.case05;

import java.util.ArrayList;
import java.util.List;

public class Slot {
		private List<Ball> balls;
		public Slot() {
			balls = new ArrayList<>();
			
			for(int i = 1; i <= 45; i++)
				balls.add(new Ball(i));
		}
			//	▼ return type
		public Ball chuck() {
			int i = (int)(Math.random() * balls.size());
			return balls.remove(i);
		}
	}
// 공 하나꺼내면 그 숫자는 리무브해서 리턴하고 숫자지워서 중복값안나옴
// 공 꺼내면 size 알아서 줄어서 신경쓸거 없음.