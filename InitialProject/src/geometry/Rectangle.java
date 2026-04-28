package geometry;

public class Rectangle extends Object {
	private Point upperLeftPoint;
	private int height;
	private int width;
	private boolean selected;
	
	public Rectangle() {

	}

	public Rectangle(Point upperLeftPoint, int width, int height) {
		this.upperLeftPoint = upperLeftPoint;
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point upperLeftPoint, int width, int height, boolean selected) {
		this(upperLeftPoint, width, height);
		this.selected = selected;
	}
	
	public int area() {
		return height * width;
	}
	
	public int circumference() {
		return 2 * (height + width);
	}
	
	public String toString() {
		return "Upper left point: " + upperLeftPoint + ", width = " + width + ", height = " + height;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle pomocna = (Rectangle) obj;
			if (this.upperLeftPoint.equals(pomocna.upperLeftPoint) 
					&& this.width == pomocna.width
					&& this.height == pomocna.height)
				return true;
		}
		return false;
	}
	
	public boolean contains(int x, int y) {
		if(this.upperLeftPoint.getX() <= x /*levo*/ &&
				this.upperLeftPoint.getY() <= y /*iznad*/ && 
				x <= this.upperLeftPoint.getX()+width /*desno*/ &&
				y <= this.upperLeftPoint.getY()+height /*ispod*/) {
			return true;
		}
		
		return false;
	}
	
	public boolean contains(Point p) {
		return this.contains(p.getX(), p.getY());
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
