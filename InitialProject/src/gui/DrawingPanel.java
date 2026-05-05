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
		Circle c1 = new Circle(new Point(200,200), 50);
		c1.draw(g);
	}

	

}
