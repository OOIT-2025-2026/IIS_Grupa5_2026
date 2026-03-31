package geometry;

public class Circle {
	private Point center;
	private int radius;
	private boolean selected;
	
	public double area() {
		return radius * radius * Math.PI;
	}
	
	public double circumference() {
		return 2 * radius * Math.PI;
	}

	public Point getCenter() {
		return center;
	}

	public int getRadius() {
		return radius;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
}
