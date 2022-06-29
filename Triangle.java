import java.text.*;

public class Triangle 
{
	// Implement instance data
	private static final double DEFAULT_SIDE_LENGTH = 1.0;
	private static DecimalFormat FORMATTOR = new DecimalFormat("#.###");
	
	
	private double sideA;
	private double sideB;
	private double sideC;
	
	
	
	// Implement constructor 
	public Triangle(double sideA, double sideB, double sideC)
	{
		if (isTriangle(sideA, sideB, sideC) == true) 
		{
			this.sideA = sideA;
			this.sideB = sideB;
			this.sideC = sideC;
		}
		else
		{
			this.sideA = DEFAULT_SIDE_LENGTH;
			this.sideB = DEFAULT_SIDE_LENGTH;
			this.sideC = DEFAULT_SIDE_LENGTH;
		}
		
	}
	
	// Implement accessors
	public double getSideA()
	{
		return sideA;
	}
	
	public double getSideB()
	{
		return sideB;
	}
	
	public double getSideC()
	{
		return sideC;
	}
	
	// Implement mutators
	public boolean setSideA(double sideA)
	{
		if (isTriangle(sideA, this.sideB, this.sideC) == true)
		{
			this.sideA = sideA;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean setSideB(double sideB)
	{
		if (isTriangle(this.sideA, sideB, this.sideC) == true)
		{
			this.sideB = sideB;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean setSideC(double sideC)
	{
		if (isTriangle(this.sideA, this.sideB, sideC) == true)
		{
			this.sideC = sideC;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// Method checks if the given side lengths create a triangle 
	private static boolean isTriangle(double sideA, double sideB, double sideC)
	{
		if (sideA <= 0 && sideB <= 0 && sideC <= 0)
		{
			return false;
		}
		if ((sideA >= sideB + sideC) || (sideB >= sideA + sideC) || (sideC >= sideA + sideB))
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	
	public String toString()
	{
		return "Triangle(" + FORMATTOR.format(sideA) + ", " + FORMATTOR.format(sideB) + ", " + FORMATTOR.format(sideC) + ")";
	}
}
