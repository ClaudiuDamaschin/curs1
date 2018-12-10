package session7;

public class TestShape {
	public static void main(String[] args) {

		Shape square = new Square(2);
		Shape rectangle = new Rectangle(3, 4);
		Shape circle = new Circle(5);

		Shape array[] = { square, rectangle, circle };

		for (int i = 0; i < array.length; i++) {
			System.out.println("Perimeter = " + array[i].getPerimeter() + " Area = " + array[i].getArea());

		}

	}

}
