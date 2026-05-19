package geometry;

import java.awt.Color;
import java.awt.Graphics;

public class Point extends Shape {

	private int x;
	private int y;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(int x, boolean selected) {
		this.x = x;
		this.selected = selected;
	}

	public Point(int x, int y, boolean selected) {
		/*
		 * this.x = x; this.y = y;
		 */
		this(x, y); // mora biti prva naredba u okviru konstruktora
		this.selected = selected;
	}

	public double distance(int x2, int y2) {
		int dx = this.x - x2;
		int dy = this.y - y2;
		double d = Math.sqrt(dx * dx + dy * dy);
		return d;
	}

	public String toString() {
		return "(" + x + "," + y + ")" + ", selected = " + selected;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point secondPoint = ((Point) obj); // tacku podsecam da je tacka - downcast

			if (this.x == secondPoint.x && this.y == secondPoint.y && this.selected == secondPoint.selected) {
				return true;
			}
		}
		return false;

	}

	public boolean contains(int x, int y) {
		return this.distance(x, y) <= 2;
	}

	@Override
	public void draw(Graphics g) {
		if (selected) {
			g.setColor(Color.BLUE);
			g.drawRect(x - 2, y - 2, 4, 4);
			g.setColor(Color.black);
		}

		g.drawLine(x - 2, y, x + 2, y);
		g.drawLine(x, y + 2, x, y - 2);

	}

	@Override
	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public void moveBy(int byX, int byY) {
		this.x = this.x + byX;
		this.y += byY;

	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Point) {
			return (int) (this.distance(0, 0) - ((Point) o).distance(0, 0));
		}
		return 0;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
