public class Mirror
{
	//prints the expanding pattern of <> for the top half of the figure
public static void main(String[] args)
	{
		line();
		topHalf();
		bottomHalf();
		line();
		
		
	}

public static void topHalf()
{
	for(int line=1; line<=4; line++)
	{
		System.out.print("|");
		for (int space=1; space<=(line*-2+8); space++)
		{
			System.out.print(" ");
		}
		System.out.print("<>");
		
		for(int dot=1; dot <=(line*4-4); dot++)
		{
			System.out.print(".");
		}
		System.out.print("<>");
		for(int space =1; space<=(line*-2 +8); space++)
		{
			System.out.print(" ");
		}
		System.out.println("|");
	}
}
	
public static void bottomHalf()
{
	for(int line=1; line<=4; line++)
	{
		System.out.print("|");
		for (int space=1; space<=(line*2-2); space++)
		{
			System.out.print(" ");
		}
		System.out.print("<>");
		
		for(int dot=1; dot <=(line*-4+16); dot++)
		{
			System.out.print(".");
		}
		System.out.print("<>");
		for(int space =1; space<=(line*2-2); space++)
		{
			System.out.print(" ");
		}
		System.out.println("|");
	}
}

public static void line()
{
	System.out.print("#");
	for (int i=1; i<=16; i++)
	{
		System.out.print("=");
	}
	System.out.println("#");
	
}
}