package bootcamp.session02.shape;

public class Rectangle implements Shape {
	
	private final double width;
	private final double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return height * width;
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}

}
