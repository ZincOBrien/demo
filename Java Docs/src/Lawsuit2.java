class Lawsuit2
{
		String status;
		int speed;
		int x;
		int y;
		float temperature;
		
		void multiply() 
		{
			System.out.println(" x times y = " + x*y);
		}
		
		void divide()
		{
			System.out.println(" x divided by y = " + x/y);
		}
		
		void countUp()
		{
			// count up all numbers from x to y and display line by line and then a sum
			
			int count = x;
			
			for(int i = x; i<=y; i++)
			{
				System.out.println("Value is: " + i + " then...");
				i++;
				count =count + i;
			}
			System.out.println(" Sum Total is: " + count);
		}
	
	void arrange()
	{
			int count = -1;
			switch (x) 
			{
			case 1:
			case 2:
			case 3:
			case 4:
				count= 1;
				break;
			case 5:
			case 6:
				count =2;
				break;
				
				
			}
			System.out.println(" count is " + count);
	
	
}
}