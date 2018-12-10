//2. Se da urmatoarea interfata:
//public interface Shape {
//  public double getArea();
//   public double getPerimeter();
// }

// Sa se implementeze 3 clase, Square, Rectangle, Circle care implementeaza aceasta interfata si sa se creeze un program in care se creaza un 
// array de Shape-uri care va contine cate o instanta din fiecare clasa creata iar fiecarei instante respective i se vor apela metodele getArea
// si getShape.

package session7;

public class Rectangle implements Shape {
	int lungime;
	int latime;

	public Rectangle(int lg, int lt) {
		this.lungime = lg;
		this.latime = lt;
	}

	@Override
	public double getArea() {
		return this.lungime * this.latime;

	}

	@Override
	public double getPerimeter() {
		return this.lungime * 2 + this.latime * 2;

	}

}
