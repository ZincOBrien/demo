class SimpleDotComTestDrive
{
	public static void main(String[] args)
	{
		int i =0;
		//declare int variable
		int numOfGuesses = 0;
		
		//make new simpledotcom instance
		SimpleDotCom newgame = new SimpleDotCom();
		
		// compute random number
		int randomNum = (int) (Math.random()*5);
		
		
		//System.out.println(" random number is; " + randomNum);
		
		
		// make an int array that starts with random number
		int array[] = {randomNum, randomNum +1, randomNum +2};
		

		newgame.SetLocation(array);
		
		GameHelper helper = new GameHelper();
		
		
		boolean isAlive = true;
		while(isAlive == true)
		{
			String guess = helper.getUserInput("enter a number");
	
			// this array will hold all the old guesses
			String oldGuess[] = new String[7];
			
			for(int n=0; n<7; n++)
			{
				if(oldGuess[i]== guess)
				{
					System.out.println(" duplicate guess try again");
				}
			}
			
			
			
			//fill the array one pice at a time each time the larger while loop cycles	
				oldGuess[i]= guess;
				System.out.println(" oldGuess " + i + " : " + oldGuess[i]);
				i++;
				
			String result = newgame.checkyourself(guess);
			
			numOfGuesses++;
			
			
			if(result == "KILL!")
			{
				isAlive = false;

				System.out.println(" number of guesses: " + numOfGuesses);
			}
					
		}
		
	
		
		
		
		
	}
	
}