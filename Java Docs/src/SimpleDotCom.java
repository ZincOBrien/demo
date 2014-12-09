class SimpleDotCom
{

		//declare an int array
	int[] locationCells;
	int numOfHits = 0;
	
	
	//declare checkyourself method
	 public String checkyourself( String stringGuess)
	 {
		// System.out.println("stringGuess  " + stringGuess);
		//user guess will be cast into int
		int guess = Integer.parseInt(stringGuess);
		String result ="MISS!";
		
		//System.out.println("locationCells  " + locationCells);
		
		
		for (int cell : locationCells)
		{
			
			if(guess == cell)
			{
				result = "HIT! ";
				numOfHits++;
				//break
			}
			
			
		}
		if(numOfHits == locationCells.length)
		{
			result = "KILL!";
		}
		System.out.println(result);
		return result;
		
		
	 }
	 
	
	 
	 
public void SetLocation(int[] locs)
{
	//place the first piece into the array
	locationCells = locs;
}

//public void printBoard()
//{
//System.out.println(" location cell lenght is: " + locationCells.length);
//
//for(int i=0; i< locationCells.length; i++)
//{
//	System.out.println(" location "  + i + "   " + locationCells[i]);
//}
//}



}

	 
