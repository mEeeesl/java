package ch05.ex08.case03;

public class Main {
	public static void main(String[] args) {
		Citrus citrus = new Citrus();
		System.out.println(citrus.getName());
		// new Citrus () 하면 또 new Citrus하고 
		// 2번째 생성된 Citrus이름은 "한라봉"이댐
		// 여기서 println은 처음 실행한 new Citrus의 이름을 묻는거라
		// 1번째 생성한 녀석이름은 안정했으니 null임
		// 그래서 
		// public Citrus() {
		// 		new Citrus("한라봉"); << 이거쓰면 1번쨰는null 2번째는 한라봉
		// 		this.name = "천혜향"; << 이거써야댐, 근데 이거쓰면 확장성떨어져서 안좋대
		// }
		// 이래서 this. 쓰는거고 this.name = name; 이런식으로 하는게 낫대
		
		citrus = new Citrus("레드향");
		System.out.println(citrus.getName());
		
		Citrus citrus1 = new Citrus("ㅈㅈㅈ");
		Citrus citrus2 = new Citrus("ㅇㅇ");
		System.out.println(citrus1.getName());
		System.out.println(citrus2.getName());
	}
}
