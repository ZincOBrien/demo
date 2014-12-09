import java.util.StringTokenizer;

class TokenTester
{
	public static void main(String[] arguments)
	{
		StringTokenizer st1, st2;
		String quote1 = "GOOG 604.43 -0.42";
		st1 = new StringTokenizer(quote1);
		System.out.println("Token1: " + st1.nextToken());
		System.out.println("Token2: " + st1.nextToken());
		System.out.println("Token3: " + st1.nextToken());
		
		String quote2 = "11/12/2014";
		st2 = new StringTokenizer(quote2, "/");
		System.out.println("\nToken 1: " + st2.nextToken());
		System.out.println("Token 2: " + st2.nextToken());
		System.out.println("Token 3: " + st2.nextToken());
		
	}
}