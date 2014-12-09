import java.awt.Point;

class FourDPoint extends Point
{
	int z;
	int t;
	
	FourDPoint(int x1, int y1, int z1, int t1 )
	{
		this.x = x1;
		this.y = y1;
		this.z = z1;
		this.t = t1;
	}
	
void display()
{
	System.out.println(" Points X " + x + "y " + y
			+ "z " +z + "t " +t);
	
}
}