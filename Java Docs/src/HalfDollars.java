class HalfDollars
{
	public static void main(String[] arguments)
	{
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
		
		//assign values to elements of array total ( based on sum of denver and phillly)
		total[0] = denver[0] + philadelphia[0];
		total[1] = denver[1] + philadelphia[1];
		total[2] = denver[2] + philadelphia[2];
		average = (total[0] + total[1] + total[2]) /3;
		
		// output by year
		System.out.print("2009 production: ");
		//output value with some formatting for new line, etc.....
		System.out.format("%,d%n", total[0]);
		System.out.print("2010 production: ");
		System.out.format("%,d%n", total[1]);
		System.out.print("2011 production: ");
		System.out.format("%,d%n", total[2]);
		System.out.print("Average production: ");
		System.out.format("%,d%n", average);
	}
}