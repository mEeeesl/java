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
			//	�� return type
		public Ball chuck() {
			int i = (int)(Math.random() * balls.size());
			return balls.remove(i);
		}
	}
// �� �ϳ������� �� ���ڴ� �������ؼ� �����ϰ� ���������� �ߺ����ȳ���
// �� ������ size �˾Ƽ� �پ �Ű澵�� ����.