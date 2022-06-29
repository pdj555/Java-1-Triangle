
public class Driver 
{
	public static void main(String[] args) 
	{
		// Create Triangle
		Triangle tri = new Triangle(5.0, 5.0, 5.0);
		
		// Tell user length of the triangle's sides
		System.out.println("The three sides of the legal triangle are: " + tri.getSideA() + " " + tri.getSideB() + " " + tri.getSideC());
		
		// Attempt to change the lengths of the triangle's sides
		tri.setSideA(9);
		tri.setSideB(6);
		tri.setSideC(7);
		
		System.out.println("A was set to 9, then B to 6 and C to 7: " + tri.toString());
		
		System.out.println();
		
		// Create new Triangle
		Triangle tri2 = new Triangle(2.0, 2.0, 10.0);
		
		// Display lengths of the Triangle's sides 
		System.out.println("The illegal triangle contained: " + tri2.toString());
		
		tri2.setSideA(7);
		
		System.out.println("Changed side A to 7: " + tri2.toString());
		
		tri2.setSideB(-10);
		
		System.out.println("Changed side B to -10: " + tri2.toString());
		
		tri2.setSideC(21);
		
		System.out.println("Changed side C to 21: " + tri2.toString());
		
	}
}
