package ch07.ex01.case04;

public class Main {
	public static void main(String[] args) {
		Platanus platanus = new Platanus();
		
		Tree tree = new Platanus();	//promotion
		
		platanus = (Platanus)tree;	//casting
		
		tree = platanus;
		tree = (Tree)platanus;
	}
}
//		double d = int i;
// 		int i  = (int)double d;