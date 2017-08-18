package bootcamp.session01;

public class Main {
	
	public static double[] quadratic(double a, double b, double c) throws Exception {
		if (b * b - 4 * a * c < 0)
			throw new Exception("Roots are not real");
		double discriminant = Math.sqrt(b * b - 4 * a * c);
		
		double z0 = ((-b) + discriminant) / (2 * a);
		double z1 = ((-b) - discriminant) / (2 * a);
		
		return (new double[] {z0, z1});
	}
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		double[] roots = quadratic(4, 1, 10);
		
		System.out.println(roots[0]);
		System.out.println(roots[1]);

	}
	
}
