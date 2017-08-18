package bootcamp.session02;

import bootcamp.session02.shape.Rectangle;
import bootcamp.session02.shape.Square;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle r = new Square(5.0);
		System.out.println(r.getArea());
	}
}
