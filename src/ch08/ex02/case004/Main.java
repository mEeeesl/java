package ch08.ex02.case004;

public class Main {
	public static void main(String[] args) {
		int choice = 1;
		String jobName = "";
		
		switch(Job.toJob(choice)) {
		case EXIT: jobName = "종료"; break;
		case LIST: jobName = "목록"; break;
		case ADD: jobName = "추가"; break;
		case FIX: jobName = "수정"; break;
		case DEL: jobName = "삭제";
		}
		
		System.out.println(jobName);
// 한계: 여기선 choice가 0~4 까지여야 하는데 초과하는 숫자를 입력하면 버그걸림
		
		choice = 9;
		Job job = null;
		switch((job = Job.toJob2(choice)) != null ? job : Job.EXIT) {
		case EXIT: jobName = "종료"; break;
		case LIST: jobName = "목록"; break;
		case ADD: jobName = "추가"; break;
		case FIX: jobName = "수정"; break;
		case DEL: jobName = "삭제";
		}
		
		System.out.println(jobName);
	}
}