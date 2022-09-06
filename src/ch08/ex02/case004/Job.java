package ch08.ex02.case004;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public enum Job {
	EXIT, LIST, ADD, FIX, DEL; //������� ������ ; �����ݷ� ����ߴ�
	
	public static Job toJob(int ordinal) { // ���ڸ� Job���� 
		return values()[ordinal]; 
	}
		//�迭���� index���� ����
		//ex) values()[0] = EXIT
		//ex) values()[1] = LIST
	
	public static Job toJob2(int ordinal) {
		/*
		Stream<Job> stream = Arrays.stream(values());
			//�迭�� stream���� stream���� EXIT LIST ~ �ִ� ����
		
		stream = stream.filter(job -> job.ordinal() == ordinal);
			//���ǿ� �´°͸� ��󳻾� ��Ʈ���� ������
			// ex) ordinal = 1; 
			//		return���� LIST (1���� ����)
			// ex) ordinal = 100;
			//		return���� ����.

		Optional<Job> job = stream.findFirst();
			//ù��°���� ����
		
		return job.orElse(null);
			// ã���� �� �� ����, ��ã���� Console -> Null Exception ����/
			// ���� �̻ڰ� ���س����� (3�� ������ ��) Exception �ذ�
		*/
		
		//chainging
		return Arrays.stream(values())
				.filter(job -> job.ordinal() == ordinal)
				.findFirst()
				.orElse(null);
	}
}
