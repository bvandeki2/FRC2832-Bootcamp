package bootcamp.session02.shape;

/**
 * A Shape is any two-dimensional object that has
 * both a perimeter and an area.
 * @author brendanvk
 *
 */
public interface Shape {
	/**
	 * Computes the area of this shape
	 * @return The area of this shape
	 */
	public double getArea();
	
	/**
	 * Computes the perimeter of this shape
	 * @return The perimeter of this shape
	 */
	public double getPerimeter();
}
