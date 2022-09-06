package ch08.ex02.case004;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public enum Job {
	EXIT, LIST, ADD, FIX, DEL; //멤버변수 쓰려면 ; 세미콜론 써줘야댐
	
	public static Job toJob(int ordinal) { // 숫자를 Job으로 
		return values()[ordinal]; 
	}
		//배열에서 index값을 리턴
		//ex) values()[0] = EXIT
		//ex) values()[1] = LIST
	
	public static Job toJob2(int ordinal) {
		/*
		Stream<Job> stream = Arrays.stream(values());
			//배열을 stream으로 stream에는 EXIT LIST ~ 있는 상태
		
		stream = stream.filter(job -> job.ordinal() == ordinal);
			//조건에 맞는것만 골라내어 스트림을 리턴함
			// ex) ordinal = 1; 
			//		return값은 LIST (1개만 리턴)
			// ex) ordinal = 100;
			//		return값은 없음.

		Optional<Job> job = stream.findFirst();
			//첫번째꺼만 리턴
		
		return job.orElse(null);
			// 찾으면 그 값 리턴, 못찾으면 Console -> Null Exception 리턴/
			// 조건 이쁘게 잘해놓으면 (3항 연산자 등) Exception 해결
		*/
		
		//chainging
		return Arrays.stream(values())
				.filter(job -> job.ordinal() == ordinal)
				.findFirst()
				.orElse(null);
	}
}
