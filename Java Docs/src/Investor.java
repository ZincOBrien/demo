public class Investor
{
	public static void main(String[] arguments)
	{
		float Inv = 14000;
		System.out.println("Initial Investment is: $" + Inv);
		//Set Inv to 1400 dollars and display
		float year1 = Inv * 1.4F;
		System.out.println("After one year: $" + year1);
		//add 40 percent and display
		
		float year2 = year1 - 1500;
		System.out.println("After two years: $" + year2);
		// lost 1500 in year 2 and displya
		
		float year3 = year2 * 1.12F;
		System.out.println("After three years: $" + year3);
		// calculate year 3 and display	
	}
}