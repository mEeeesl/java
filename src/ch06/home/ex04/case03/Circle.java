package ch06.home.ex04.case03;

public class Circle {
	private Point point;
	private int r;
	
	public Circle (Point point, int r) {
 	 // 1¹ø public Circle ( int x, int y, int r) 
	 //	this.point = new Point(x, y);
		this.point = point;
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d", this.point, this.r);
	}
}
