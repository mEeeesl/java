package ch04.home.ex03;

public class Money {
	public static void main(String[] args) {
		int price = 30_000;
		int tot = 0;	// 손에 쥔 돈
		int tmp = 0;	// 꺼낸 돈
			
		while(tot < price) {
			tmp = ((int)(Math.random() * 30) + 1) * 1000; // 1,000단위
			System.out.println(tmp);
			tot += tmp;
		}
		
		System.out.printf("\n%d원을 꺼냈습니다.", tot);
		
		// unit test
		// integration test
		/*int money = 0;	//	꺼낸 돈
		int tot = 0;		//	총액
		
		while(tot < 30_000) {
			money = (int)(Math.random() * 30000 )+ 1000;
			
			if (money % 1000 == 0) {
				System.out.print(money + "원\n");
				tot += money;
			}
			
			if (tot >= 30_000)  break;
		}
		
		System.out.println(tot + "원을 꺼냈습니다.");*/
	}
}
/*
과제 ]
3만원짜리 물건값을 치뤄라. => x < 30000

지갑에서 지폐를 여러번 꺼낸다 => 반복문

지갑에 5만원권은 없다. => (int)Math.random()*30000 > 
 
꺼낸 돈의 권(종류)를 구별하지 않는다.

한번에 3만원 이하를 꺼낸다. (int)Math.random()*30000 >

꺼낼 때마다, 꺼낸 금액을 출력한다. tot += tot xx // 
money = %d를 꺼냈습니다. , money
tot += money // tot+"원을 꺼냈습니다." 

 필요한 것 = 금액, 쓴돈(토탈)
 
 12000
 2000
 6000
 10000
 
 30000원을 껴냈습니다.
*/