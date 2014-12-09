class Loops {
	public static void main (String args[]) 
	{
		
		//1
	for (int i=1; i<4; i++)
	{
		for(int j=1; j<i; j++)
		{
			System.out.println(i + " " + j);
		}
	}
	
	//2
	for (int i =0; i <4; i++)
		for (int j =1; j<i; j++)
			System.out.println(i + " " + j);
		
	//3
	for (int i =1; i<4; i++)
		for(int j=1; j<i; j++)
			System.out.println(i + " " + j);
	
	//4
	int T=0;
	for (int i=1; i<4; i++)
		for(int j =1; j < 2*i; j =+ 2)
			T += j * i;
			System.out.println("T = " + T);
	
	
	
	
	
	
	
	
	
	
	
	}
}