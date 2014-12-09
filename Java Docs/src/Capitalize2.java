public class Capitalize2
{
	static void printCapitalized( String str)
	{
		char ch;
		char prevCh;
		int i;
		prevCh = '.';
		
		for ( i =0; i <str.length(); i++)
		{
			ch = str.charAt(i);
			
			if(Character.isLetter(ch) && ! Character.isLetter(prevCh))
			{
				System.out.print( Character.toUpperCase(ch));
			}
			else
			{
				System.out.print( ch );
				
			}
			prevCh = ch;
			
		}
		System.out.println();
	}
	
	
public static void main(String args[])
{
	String inputvar = "this is my input sentence";
	
	printCapitalized(inputvar);
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}