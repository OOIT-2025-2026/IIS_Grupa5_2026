package gui;

import java.awt.Graphics;

import javax.swing.JPanel;

import geometry.Circle;
import geometry.Point;

public class DrawingPanel extends JPanel {

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		Circle c1 = new Circle(new Point(200, 200), 50);
		c1.draw(g);

		// Vezbe 7
		Point p1 = new Point(50, 50);
		p1.draw(g);

		p1.moveTo(60, 60);
		p1.draw(g);

		p1.moveBy(60, 60);
		p1.draw(g);

		Point p2 = new Point(80, 80);
		System.out.println(p1.compareTo(p2));

	}

}
