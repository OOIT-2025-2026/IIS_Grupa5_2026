package geometry;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		p.setX(10);
		p.setY(20);
		p.setSelected(true);
		
		System.out.println("Koordinata x tacke p je: " + p.getX());
		System.out.println("Koordinata y tacke p je: " + p.getY());
		System.out.println("Obelezje selected tacke p je: " + p.isSelected());
	}

}
