package ch07.ex07.case06;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i <= 3; i++) list.add(i);
		
		list.forEach(x -> System.out.print(x + " "));
		
		//과제] forEach()로, 원소값이 짝수이면 출력하라.
		
		list.forEach(x -> {
			if (x % 2 == 0) 
				System.out.print(x);
		});
	}
}
/* list에는 forEach라는 API가 원래 있고, 파라미터로 lambda를 받을 수 있음.

List<Integer> list = new ArrayList<>();
for(int i = 1; i<= 3; i++) list.add(i)

list.forEach(x -> System.out.print(x + " "));
list.forEach(x -> {
	if ( x % 2 == 0)
		System.out.print(x);
});


*/