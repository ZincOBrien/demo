import java.util.StringTokenizer;

class Birthday
{
	public static void main(String[] arguments)
	{
		StringTokenizer st1;
		
		String quote1 = "08/23/2002";
		st1 = new StringTokenizer(quote1, "/");
		System.out.println("\nBirthday: " + quote1);
		System.out.println("Month: " + st1.nextToken());
		System.out.println("Day: " + st1.nextToken());
		System.out.println("Year: " + st1.nextToken());
		
	}
}