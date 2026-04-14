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
		//Vezbe 3
		double d = p.distance(20,30);
		System.out.println("Razdaljina izmedju tacaka: " + d);
		
		Point p1 = new Point();
		p1.setX(15);
		p1.setY(27);
		p1.setSelected(true);

		Line l1 = new Line();
		Circle c1 = new Circle();

		// 1. Inicijalizovati x koordinatu tacke p
		// na vrednost y koordinate tacke p1

		p.setX(p1.getY());
		System.out.println("X of p = " + p.getX());

		// 2. Postaviti za pocetnu tacku linije l1 tacku p, a
		// za krajnju tacku linije l1 tacku p1

		l1.setStartPoint(p);
		l1.setEndPoint(p1);

		// 3. Postaviti y koordinatu krajnje tacke l1 na 23

		l1.getEndPoint().setY(23);
		System.out.println("Y of end point of line l1 = " + l1.getEndPoint().getY());
		System.out.println("Y koordinata tacke p1 =" + p1.getY());
		// 4. Inicijalizovati x koordinatu pocetne tacke linije l1
		// na vrednost y koordinate krajnje tacke linije l1

		l1.getStartPoint().setX(l1.getEndPoint().getY());
		System.out.println("X of start point of line l1 = " + l1.getStartPoint().getX());

		// 5. Postaviti x koordinatu krajnje tacke l1 na vrednost
		// duzine linije l1 umanjene za vrednost zbira x i y
		// koordinate pocetne tacke linije l1

		l1.getEndPoint().setX((int) (l1.length() - (l1.getStartPoint().getX() + 											l1.getEndPoint().getY())));

		// 6. Postaviti x koordinatu tacke gore levo pravougaonika
		// r1 na vrednost 10 i y koordinatu na vrednost 15

		Rectangle r1 = new Rectangle();
		r1.setUpperLeftPoint(new Point());
		r1.getUpperLeftPoint().setX(10);
		r1.getUpperLeftPoint().setY(15);
		System.out.println("X of U.L.P of r1 = " + r1.getUpperLeftPoint().getX());
		System.out.println("Y of U.L.P of r1 = " + r1.getUpperLeftPoint().getY());

		// 7. Postaviti centar kruga c1 na koordinate tacke
		// gore levo od r1

		c1.setCenter(r1.getUpperLeftPoint());
		System.out.println("X of center of c1 = " + c1.getCenter().getX());
		System.out.println("Y of center of c1 = " + c1.getCenter().getY());

		// 8. Postaviti x koordinatu centra kruga c1 na vrednost razlike
		// povrsine pravougaonika r1 i y koordinate pocetne tacke linije l1

		r1.setHeight(20);
		r1.setWidth(30);
		c1.getCenter().setX(r1.area() - l1.getStartPoint().getY());
		System.out.println("X of center of c1 = " + c1.getCenter().getX());
		
		// Vezbe 4
		Point p41 = new Point(40,50);
		System.out.println(p41.getX());
		Point p42 = new Point(60,70);
		Line l41 = new Line(p41,p42);
		
		System.out.println(p41); 
		// toString se podrazumeva jer je p41 kao parametar System.out.println
		System.out.println(p41.toString());
		System.out.println(l41); 
		
		// EQUALS metoda
		int c = 5; //int je primitivni tip
		int g = 5; 
		System.out.println(c == g); 
		 
		g = 7; 
		System.out.println(c == g); 

		String e = "abcd"; // String je klasa
		String f = "abc"; // kreira se novi objekat 
		System.out.println(e == f);


		String h = "abc"; //referencira se postojeci objekat
		System.out.println(f == h); 

		String s1 = new String("Hello World");
		String s2 = new String("Hello World"); // kreira se novi objekat 
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2)); // poredjenje po vrednosti jer je redefinisana u klasi String
		
		Point p43 = new Point(40,50);
		Point p44 = new Point(40,50);
		System.out.println(p43==p44);
		System.out.println(p43.equals(p44)); // pre redefinisanja vraca false, posle vraca false
		System.out.println(p43.equals(l41));
	}

}
