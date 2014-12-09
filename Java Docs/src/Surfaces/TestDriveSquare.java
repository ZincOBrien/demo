;package Surfaces;

public class TestDriveSquare
{
	public static void main(String[] args)
	{
		Surfaces.Square sqr = new Surfaces.Square();
		
		sqr.side = 32.40;
		
		System.out.println("\nSquare Characteristics");
		System.out.printf("Side:   %.2f", sqr.side);
		System.out.printf("\nArea: %.2f\n", sqr.calculateArea());
	}
	
	
	
	
}