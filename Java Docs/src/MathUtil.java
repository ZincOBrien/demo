public class MathUtil
{
public double cubedRoot(int num)
	{
	return Math.pow(num,  1.0/3);
	}
	
	public double circumference (double radius)
	{
		return 2 *Math.PI*radius;
	}
	
	// usese math.pi pulls from the superclass the pi method
	public double area (double radius)
	{
		return Math.PI*radius*radius;
	}
}