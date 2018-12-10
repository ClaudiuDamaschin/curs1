//2. Se da urmatoarea interfata:
//public interface Shape {
//  public double getArea();
//  public double getPerimeter();
//}

//Sa se implementeze 3 clase, Square, Rectangle, Circle care implementeaza aceasta interfata si sa se creeze un program in care se creaza un 
//array de Shape-uri care va contine cate o instanta din fiecare clasa creata iar fiecarei instante respective i se vor apela metodele getArea
//si getShape.

package session7;

public class Square implements Shape {
	private int side;

	public Square(int side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		return this.side * this.side;
	}

	public double getShape() {
		return this.side * 4;
	}

	@Override
	public double getPerimeter() {

		return 0;
	}
}
