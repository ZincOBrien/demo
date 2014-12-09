class HalfLooper2
{
	public static void main(String[] arguments)
	{
		int sum =0;
		
		// new array called denver with 3 positions and give values
		int[] denver = { 1_900_000, 1_700_000, 1_700_000 };
		
		// new array called philadelphia with same array size as denver (3)
		int[] philadelphia = new int[denver.length];
		
		//new array named total same size as denver
		int[] total = new int[denver.length];
		
		//new variable
		int average;
		
		//assign values to elements of array philadelphia
		philadelphia[0] = 1_900_000;
		philadelphia[1] = 1_800_000;
		philadelphia[2] = 1_750_000;
		
		
		
		// use for loop to disply each year production
		
		for (int i=0; i< total.length; i++)
		{
			
			int year = 2009 + i;
			total[i] = denver[i] + philadelphia[i];
			System.out.println(year + " production was: " 
					+ total[i]);
			sum += total[i];
			
		}
		
		average = sum/3;
		System.out.print("\tAverage: " + average); 
	}
}