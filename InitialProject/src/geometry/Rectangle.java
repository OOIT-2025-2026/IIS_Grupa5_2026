package geometry;

public class Rectangle {
	private Point upperLeftPoint;
	private int height;
	private int width;
	
	public int area() {
		return height * width;
	}
	
	public int circumference() {
		return 2 * (height + width);
	}
	
	public Point getUpperLeftPoint() {
		return upperLeftPoint;
	}
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	public void setUpperLeftPoint(Point upperLeftPoint) {
		this.upperLeftPoint = upperLeftPoint;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWidth(int width) {
		this.width = width;
	}
}
