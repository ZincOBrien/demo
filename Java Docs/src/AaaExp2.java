import java.util.Scanner;

public class AaaExp2 

{

	
	public static void main (String args[]) 
	{
	Scanner scan = new Scanner(System.in);	
	
	System.out.print("enter x: ");
	int x = scan.nextInt();
	
	System.out.print("enter y: ");
	int yFirst = scan.nextInt();
	
	int product = 1;
	
	for (int y = yFirst; y >0; y--)
	{
		product *= x;
		System.out.println("result = " + product);
	}
	
	}
}