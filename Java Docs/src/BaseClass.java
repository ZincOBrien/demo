class BaseClass
{
	public int x =10;
	private int y =10;
		protected int z =10;
	int a =10;
	
	public int getX()
	{
		return x;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	private int getY()
	{
		return y;
	}
	private void setY(int y)
	{
		this.y =y;
	}
	
	protected int getZ()
	{
		return z;
	}
	protected void setZ(int z)
	{
		this.z =z;
	}
	int getA()
	{
		return a;
	}
	
	void setA(int a)
	{
		this.a=a;
	}
	void display()
	{
		System.out.println(" x value is: " +x);
	}




public static void main(String [] args)
{

	//Box2 rect;
	
	//System.out.println("Calling box2 with " 
	//+ "coordinates (25,25) and (50,50):");
	//rect = new Box2(25, 25,50,50);
	//rect.printBox();
	
	BaseClass newvar;
	newvar = new BaseClass();
	newvar.getX();
	int x=newvar.getX();
	
	System.out.println(" value x: " + x);
	
	
}
	
}
	
	
	
	
	
	
	
	
	
	
