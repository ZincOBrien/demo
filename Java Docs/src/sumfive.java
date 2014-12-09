class sumfive
{
public static void main(String args[]) 
	{
		int total =0;
		int counter=0;
				
		for (int i =1; i<=5; i++ )
		{
			counter = i;
			total = total + counter;
			System.out.println(i);
			System.out.println(total);
		}
	}
}