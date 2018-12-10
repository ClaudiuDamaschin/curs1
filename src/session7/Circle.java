
//2. Se da urmatoarea interfata:
//public interface Shape {
// public double getArea();
//  public double getPerimeter();
//}

//Sa se implementeze 3 clase, Square, Rectangle, Circle care implementeaza aceasta interfata si sa se creeze un program in care se creaza un 
//array de Shape-uri care va contine cate o instanta din fiecare clasa creata iar fiecarei instante respective i se vor apela metodele getArea
//si getShape.

package session7;

public class Circle implements Shape {
	private int raza;

	public Circle(int r) {
		this.raza = r;
	}

	@Override
	public double getArea() {
		return Math.PI * this.raza * this.raza;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * raza;
	}

}
