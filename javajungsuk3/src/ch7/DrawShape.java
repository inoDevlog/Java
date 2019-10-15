package ch7;

class DrawShape {
	public static void main(String[] args) {
		Point1[] p = { new Point1(100, 100), new Point1(140, 50), new Point1(200, 100), };
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point1(150, 150), 50);

		t.draw();
		c.draw();
	}
}

class Shape {
	String color = "black";

	void draw() {
		System.out.printf("[color=%s]%n", color);
	}
}

class Point1 {
	int x;
	int y;

	Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}

	Point1() {
		this(0, 0);
	}

	String getXY() {
		return "(" + x + ", " + y + ")";
	}
}

class Circle extends Shape {
	Point1 center;
	int r;

	Circle() {
		this(new Point1(0, 0), 100);
	}

	Circle(Point1 center, int r) {
		this.center = center;
		this.r = r;
	}

	void draw() {
		System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
	}
}

class Triangle extends Shape {
	Point1[] p = new Point1[3];

	Triangle(Point1[] p) {
		this.p = p;
	}

	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}